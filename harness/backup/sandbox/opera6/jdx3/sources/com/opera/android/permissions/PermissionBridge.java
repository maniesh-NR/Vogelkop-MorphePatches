package com.opera.android.permissions;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.opera.android.browser.chromium.ChromiumContent;
import defpackage.b94;
import defpackage.jb;
import defpackage.kag;
import defpackage.lag;
import defpackage.nrl;
import defpackage.s9g;
import defpackage.vml;
import defpackage.vzk;
import defpackage.w9g;
import defpackage.x9g;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PermissionBridge {
    public static int getPermissionStatus(boolean z, int i, @NonNull String str, @NonNull String str2, boolean z2) {
        s9g s9gVar = s9g.h;
        lag lagVarD = lag.d(i);
        s9gVar.getClass();
        lag lagVar = lag.a;
        kag kagVarH = kag.DENIED;
        if (lagVarD != lagVar && s9g.k(lagVarD, str, str2, z2)) {
            if (lagVarD != lag.b && lagVarD != lag.h) {
                str = str2;
            }
            kagVarH = s9gVar.h(lagVarD, str, z);
        }
        return kagVarH.a;
    }

    public static int requestPermissions(boolean z, @NonNull ChromiumContent chromiumContent, @NonNull int[] iArr, @NonNull String str, @NonNull String str2, boolean z2, @NonNull PermissionCallback permissionCallback) {
        int length = iArr.length;
        lag[] lagVarArr = new lag[length];
        for (int i = 0; i < iArr.length; i++) {
            lagVarArr[i] = lag.d(iArr[i]);
        }
        s9g s9gVar = s9g.h;
        s9gVar.getClass();
        cag[] cagVarArr = new cag[length];
        boolean z3 = false;
        for (int i2 = 0; i2 < length; i2++) {
            lag lagVar = lagVarArr[i2];
            lag lagVar2 = lag.a;
            kag kagVar = kag.DENIED;
            if (lagVar == lagVar2) {
                cagVarArr[i2] = new cag(kagVar, (dag) null);
            } else if (s9g.k(lagVar, str, str2, z2)) {
                kag kagVarH = s9gVar.h(lagVarArr[i2], str, z);
                if (kagVarH == kag.ASK) {
                    z3 = true;
                }
                cagVarArr[i2] = f03.l(lagVarArr[i2], kagVarH);
            } else {
                cagVarArr[i2] = f03.l(lagVarArr[i2], kagVar);
            }
        }
        if (!z3) {
            permissionCallback.run(cagVarArr);
            return -1;
        }
        nrl nrlVar = new nrl();
        nrlVar.a = z;
        Objects.requireNonNull(s9gVar);
        nrlVar.b = s9gVar;
        int i3 = s9g.i;
        s9g.i = i3 + 1;
        jb jbVar = new jb(nrlVar, chromiumContent, i3, lagVarArr, cagVarArr, str, str2, !z, permissionCallback);
        s9gVar.g.put(Integer.valueOf(i3), jbVar);
        jbVar.f();
        return i3;
    }

    public static void resetPermission(boolean z, int i, @NonNull String str) {
        s9g.h.b(lag.d(i), str, z);
    }

    public static int subscribePermissionStatusChange(boolean z, int i, @NonNull String str, @NonNull PermissionCallback permissionCallback) {
        int andIncrement;
        s9g s9gVar = s9g.h;
        lag lagVarD = lag.d(i);
        b94 b94Var = new b94(vml.d, permissionCallback, (byte) 0);
        if (lagVarD == lag.a) {
            s9gVar.getClass();
            return 0;
        }
        vzk vzkVarJ = s9gVar.j(z);
        b94 b94Var2 = new b94(lagVarD, b94Var, (byte) 3);
        synchronized (vzkVarJ.a) {
            y9g y9gVar = (y9g) vzkVarJ.c;
            w9g w9gVar = new w9g(str, lagVarD);
            x9g x9gVar = new x9g(w9gVar, b94Var2);
            andIncrement = y9g.c.getAndIncrement();
            y9gVar.a.put(andIncrement, x9gVar);
            y9gVar.b.u(w9gVar, x9gVar);
        }
        return andIncrement;
    }

    public static void unsubscribePermissionStatusChange(boolean z, int i) {
        List listUnmodifiableList;
        vzk vzkVarJ = s9g.h.j(z);
        synchronized (vzkVarJ.a) {
            y9g y9gVar = (y9g) vzkVarJ.c;
            SparseArray sparseArray = y9gVar.a;
            x9g x9gVar = (x9g) sparseArray.get(i);
            if (x9gVar != null) {
                sparseArray.remove(i);
                nce nceVar = y9gVar.b;
                Collection collection = (Collection) nceVar.e.remove(x9gVar.a);
                if (collection == null) {
                    listUnmodifiableList = Collections.EMPTY_LIST;
                } else {
                    Collection collectionS = nceVar.s();
                    collectionS.addAll(collection);
                    nceVar.f -= collection.size();
                    collection.clear();
                    listUnmodifiableList = Collections.unmodifiableList((List) collectionS);
                }
                List list = listUnmodifiableList;
            }
        }
    }
}
