package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.i;
import com.google.android.gms.tasks.OnSuccessListener;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class uf implements yjj, nl5, OnSuccessListener, swl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ uf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // defpackage.nl5
    public final void b(int i) {
        vl8 vl8Var = (vl8) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        String str3 = (String) this.e;
        im8 im8Var = (im8) this.f;
        boolean z = i == 1;
        HashMap map = vl8Var.a;
        if (!TextUtils.isEmpty(str)) {
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(str, map2);
            }
            map2.put(Pair.create(str2, str3), Boolean.valueOf(z));
        }
        im8Var.onResult(Boolean.valueOf(z));
    }

    @Override // defpackage.yjj
    public final i c(ViewGroup viewGroup) {
        kze kzeVar = (kze) this.b;
        r2 r2Var = (r2) this.c;
        xj xjVar = (xj) this.d;
        so3 so3Var = (so3) this.e;
        li liVar = (li) this.f;
        AppCompatImageView appCompatImageViewN = j7c.n(viewGroup, 2131558560, viewGroup, false);
        if (appCompatImageViewN != null) {
            return new tf(new cq3((View) appCompatImageViewN, (byte) 0), kzeVar, r2Var, xjVar, so3Var, liVar);
        }
        t3p.q("rootView");
        return null;
    }

    public final void onSuccess(Object obj) {
        mab mabVar = (mab) this.b;
        String str = (String) this.c;
        r0k r0kVar = (r0k) this.d;
        Locale locale = (Locale) this.e;
        x5f x5fVar = (x5f) this.f;
        for (qop qopVar : (List) obj) {
            if (qopVar.b().contains(str)) {
                if (mabVar.getLifecycle().i.d(qcc.c)) {
                    Context contextRequireContext = mabVar.requireContext();
                    String[] strArr = OperaApplication.K;
                    x5f x5fVar2 = ((OperaApplication) contextRequireContext.getApplicationContext()).L().c;
                    Context contextRequireContext2 = mabVar.requireContext();
                    int i = mabVar.e;
                    byte b = 0;
                    kab kabVar = new kab(mabVar, b);
                    lab labVar = new lab(mabVar, x5fVar2, b);
                    u85 u85Var = new u85(contextRequireContext2, r0kVar, qopVar.a, new z8e(mabVar, (byte) 0), mabVar, i, kabVar, labVar);
                    u85Var.h(qopVar);
                    mabVar.d = u85Var;
                    return;
                }
                return;
            }
        }
        mabVar.f0(r0kVar, locale, x5fVar);
    }

    @Override // defpackage.swl
    public final qwl run() throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        byte[] bArrB;
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 4:
                le9 le9Var = (le9) obj5;
                byte[] bArr = (byte[]) obj4;
                pwl pwlVar = (pwl) obj3;
                Runnable runnable = (Runnable) obj2;
                Callback callback = (Callback) obj;
                oji ojiVar = le9Var.d;
                String strR = ojiVar.r();
                PrivateKey privateKeyZ = ojiVar.z();
                if (strR == null || privateKeyZ == null || (bArrB = p36.b(1, bArr, pwlVar.f)) == null) {
                    return null;
                }
                String strEncodeToString = Base64.encodeToString(bArrB, 2);
                byte[] bytes = strEncodeToString.getBytes();
                byte[] bArrD = p36.d(privateKeyZ, "SHA512withRSA/PSS", bytes);
                if (bArrD == null) {
                    bArrD = p36.d(privateKeyZ, "SHA512withRSA", bytes);
                }
                byte[] bArr2 = bArrD;
                if (bArr2 != null) {
                    return new ae9(le9Var, strR, pwlVar, strEncodeToString, bArr2, runnable, callback);
                }
                return null;
            default:
                final le9 le9Var2 = (le9) obj5;
                final String str = (String) obj4;
                final List list = (List) obj3;
                final rl rlVar = (rl) obj2;
                final vk2 vk2Var = (vk2) obj;
                final String strR2 = le9Var2.d.r();
                if (strR2 != null) {
                    return new qwl() { // from class: lwl
                        @Override // defpackage.qwl
                        public final ih4 run() throws JSONException {
                            orb orbVar;
                            le9 le9Var3 = le9Var2;
                            le9Var3.getClass();
                            orb orbVar2 = new orb();
                            orbVar2.p(str, "payload");
                            List list2 = list;
                            if (list2 == null || list2.isEmpty()) {
                                orbVar = null;
                            } else {
                                orbVar = new orb();
                                vpb vpbVar = new vpb();
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    vpbVar.a((String) it.next());
                                }
                                orbVar.p(vpbVar, "device_ids");
                            }
                            if (orbVar != null) {
                                orbVar2.p(orbVar, "target");
                            }
                            return new nwl(le9Var3, vk2Var, strR2, orbVar2, rlVar);
                        }
                    };
                }
                return null;
        }
    }
}
