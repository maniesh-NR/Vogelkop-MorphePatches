package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class v4b extends jwh implements ysd {
    public final String a = sko.i(System.identityHashCode(this), "incognito");
    public final LinkedHashMap b = new LinkedHashMap();

    public v4b(tcc tccVar, final nr5 nr5Var, final zsd zsdVar) {
        final byte b = 1;
        final byte b2 = 0;
        if (nr5Var != null) {
            oup.l0(tccVar, new Function1() { // from class: gp7
                public final Object invoke(Object obj) {
                    switch (b2) {
                        case 0:
                            nr5 nr5Var2 = nr5Var;
                            v4b v4bVar = this;
                            synchronized (((ArrayList) nr5Var2.b)) {
                                ((ArrayList) nr5Var2.b).add(v4bVar);
                            }
                            return Unit.a;
                        default:
                            nr5 nr5Var3 = nr5Var;
                            v4b v4bVar2 = this;
                            synchronized (((ArrayList) nr5Var3.b)) {
                                ((ArrayList) nr5Var3.b).remove(v4bVar2);
                            }
                            return Unit.a;
                    }
                }
            }, new Function1() { // from class: gp7
                public final Object invoke(Object obj) {
                    switch (b) {
                        case 0:
                            nr5 nr5Var2 = nr5Var;
                            v4b v4bVar = this;
                            synchronized (((ArrayList) nr5Var2.b)) {
                                ((ArrayList) nr5Var2.b).add(v4bVar);
                            }
                            return Unit.a;
                        default:
                            nr5 nr5Var3 = nr5Var;
                            v4b v4bVar2 = this;
                            synchronized (((ArrayList) nr5Var3.b)) {
                                ((ArrayList) nr5Var3.b).remove(v4bVar2);
                            }
                            return Unit.a;
                    }
                }
            }, (Function1) null, (Function1) null, 12);
        }
        if (zsdVar != null) {
            oup.l0(tccVar, new Function1() { // from class: atd
                public final Object invoke(Object obj) {
                    byte b3 = b2;
                    v4b v4bVar = this;
                    zsd zsdVar2 = zsdVar;
                    switch (b3) {
                        case 0:
                            zsdVar2.a.add(v4bVar);
                            break;
                        default:
                            zsdVar2.a.remove(v4bVar);
                            break;
                    }
                    return Unit.a;
                }
            }, new Function1() { // from class: atd
                public final Object invoke(Object obj) {
                    byte b3 = b;
                    v4b v4bVar = this;
                    zsd zsdVar2 = zsdVar;
                    switch (b3) {
                        case 0:
                            zsdVar2.a.add(v4bVar);
                            break;
                        default:
                            zsdVar2.a.remove(v4bVar);
                            break;
                    }
                    return Unit.a;
                }
            }, (Function1) null, (Function1) null, 12);
        }
    }

    public final boolean b(jvh jvhVar) {
        return Intrinsics.a(jvhVar.b.getScheme(), this.a);
    }

    public final ro9 e(jvh jvhVar, int i) {
        byte[] bArrG = g(jvhVar.b);
        if (bArrG != null) {
            return new ro9(new re6(bArrG, (byte) 1), 1);
        }
        return null;
    }

    public final byte[] g(Uri uri) {
        byte[] bArr;
        synchronized (this.b) {
            t4b t4bVar = (t4b) this.b.get(uri);
            bArr = t4bVar != null ? t4bVar.a : null;
        }
        return bArr;
    }

    public final Uri h(File file) {
        return new Uri.Builder().scheme(this.a).path(file.getPath()).build();
    }

    public final ehc i(Uri uri) {
        String path;
        ehc ehcVarB = a.b();
        synchronized (this.b) {
            Iterator it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                Uri uri2 = (Uri) ((Map.Entry) it.next()).getKey();
                String path2 = uri2.getPath();
                boolean z = false;
                if (path2 != null && (path = uri.getPath()) != null && c.q(path2, path, false)) {
                    String strSubstring = path2.substring(path.length());
                    char c = File.separatorChar;
                    if (StringsKt.c0(strSubstring, c)) {
                        strSubstring = strSubstring.substring(1);
                    }
                    z = !StringsKt.F(strSubstring, c);
                }
                if (z) {
                    ehcVarB.add(uri2);
                }
            }
        }
        return a.a(ehcVarB);
    }

    public final void j(Uri uri, byte[] bArr, EnumSet enumSet) {
        synchronized (this.b) {
        }
    }

    public final void k(Uri uri) {
        synchronized (this.b) {
        }
    }

    @Override // defpackage.ysd
    public final void l(int i) {
        if (j7c.a(i, 2)) {
            synchronized (this.b) {
                LinkedHashMap linkedHashMap = this.b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((t4b) entry.getValue()).b.contains(u4b.a)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = tbd.k(linkedHashMap2).iterator();
                while (it.hasNext()) {
                    this.b.remove(((Pair) it.next()).a);
                }
            }
        }
    }
}
