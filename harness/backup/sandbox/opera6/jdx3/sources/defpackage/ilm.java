package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.leanplum.utils.SizeUtil;
import com.opera.android.autofill.PasswordDataMonitor;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.startup.WelcomeActivity;
import com.opera.android.webcore.WebcoreRpcBridge;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.text.c;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final /* synthetic */ class ilm implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ilm(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        int i = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((hlm) obj2).a(f8a.h.a("Uninstall-" + ((String) obj)));
                break;
            case 1:
                jnm jnmVar = (jnm) obj2;
                jnmVar.e = !w1h.m((SharedPreferences) obj, "unseen_download_ids").isEmpty();
                jnmVar.c.K();
                break;
            case 2:
                som somVar = (som) obj2;
                Boolean bool = (Boolean) obj;
                if (somVar.h != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    PasswordDataMonitor passwordDataMonitor = somVar.i;
                    if (!zBooleanValue) {
                        if (passwordDataMonitor != null) {
                            passwordDataMonitor.a();
                            somVar.i = null;
                        }
                        somVar.l = true;
                        break;
                    } else if (passwordDataMonitor == null) {
                        PasswordManager passwordManager = somVar.h;
                        rom romVar = new rom(somVar, (byte) 2);
                        passwordManager.getClass();
                        PasswordDataMonitor passwordDataMonitor2 = new PasswordDataMonitor();
                        passwordDataMonitor2.a = romVar;
                        passwordDataMonitor2.b = N.MtK05rRq(passwordDataMonitor2);
                        somVar.i = passwordDataMonitor2;
                        break;
                    }
                }
                break;
            case 3:
                cbk cbkVar = (cbk) obj2;
                a1b a1bVarU = ((h1b) obj).u(0);
                while (true) {
                    if (a1bVarU.hasNext()) {
                        String str = (String) a1bVarU.next();
                        String str2 = (String) cbkVar.c;
                        ari ariVar = (str.length() == str2.length() || !c.q(str, str2, false)) ? null : new ari(str);
                        if (ariVar != null) {
                            ((ArrayList) cbkVar.d).add(ariVar);
                        }
                    }
                }
                cbkVar.b();
                break;
            case 4:
                ((ldh) obj2).invoke((Drawable) obj);
                break;
            case 5:
                mm2 mm2Var = (mm2) obj2;
                if (((Boolean) obj).booleanValue()) {
                    s9g.h.o(mm2Var.b, (String) mm2Var.c, lag.b, kag.GRANTED, true);
                    break;
                }
                break;
            case 6:
                ((a7n) obj2).f.e(new xyg(i), false);
                break;
            case 7:
                ndn ndnVar = (ndn) obj2;
                fdn fdnVar = (fdn) obj;
                if (!fdnVar.e || fdnVar.equals(ndnVar.p)) {
                    ndnVar.n.remove(fdnVar);
                    ndnVar.n.add(0, fdnVar);
                    while (ndnVar.n.size() > 3) {
                        List list = ndnVar.n;
                        list.remove(list.size() - 1);
                    }
                    ru9 ru9VarC = ru9.c(ndnVar.a);
                    String strJoin = TextUtils.join(String.valueOf(';'), nb6.W(new bql((byte) 7), ndnVar.n));
                    nv6 nv6VarB = ru9VarC.b();
                    ((SharedPreferences.Editor) nv6VarB.a).putString("settings.vpn.location.recently_used", strJoin);
                    nv6VarB.w();
                    break;
                }
                break;
            case 8:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ydn ydnVar = (ydn) ((u7k) obj2).a;
                Callback callback = ydnVar.M;
                ydnVar.M = null;
                if (!zBooleanValue2) {
                    ydnVar.H = (byte) 0;
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    ydnVar.C(false);
                    break;
                } else {
                    ydnVar.H = (byte) 3;
                    if (callback != null) {
                        callback.run(Boolean.TRUE);
                        break;
                    }
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                pkn pknVar = (pkn) obj2;
                if (((List) obj).stream().anyMatch(new nn((byte) 20))) {
                    ysj ysjVar = pknVar.f.p;
                    ysjVar.b(am2.i(2132019290, 2500, ysjVar), ijm.b);
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                vq8 vq8Var = (vq8) obj2;
                RealCall realCallD = vq8Var.d((Set) obj);
                boolean zI = vq8Var.i();
                rii riiVar = (rii) vq8Var.l;
                if (!zI) {
                    umi umiVar = (umi) vq8Var.g;
                    nml nmlVarE = umiVar.e(new r2n((Object) vq8Var, (byte) 11));
                    nmlVarE.b(umiVar.f(new vdi(vq8Var, realCallD, riiVar, (byte) 13)));
                    nmlVarE.a(null);
                    break;
                } else {
                    realCallD.enqueue(new dln(vq8Var, (gln) riiVar, true));
                    break;
                }
            case 11:
                ((dnn) obj).a(new tvk((m59) obj2));
                break;
            case 12:
                ((dnn) obj).a(new dcl((l45) obj2));
                break;
            case 13:
                s14 s14Var = (s14) obj2;
                s14Var.b = false;
                s14Var.f = (qmn) obj;
                ArrayList arrayList = (ArrayList) s14Var.e;
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                int size = arrayList2.size();
                while (i < size) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    ((Callback) obj3).run((qmn) s14Var.f);
                }
                break;
            case 14:
                ilm ilmVar = (ilm) obj2;
                aln alnVar = (aln) obj;
                if (alnVar == null) {
                    ilmVar.run(new pmn((byte) 0));
                    break;
                } else {
                    ilmVar.run(new omn(alnVar));
                    break;
                }
            case 15:
                gkn gknVar = (gkn) obj;
                lh4 lh4Var = (lh4) ((ks3) obj2).i;
                if (lh4Var != null) {
                    lh4Var.run(gknVar);
                    break;
                }
                break;
            case 16:
                ((srn) obj2).a.z0().a((b87) obj);
                break;
            case 17:
                String str3 = (String) obj;
                long j = ((WebcoreRpcBridge) obj2).a;
                if (j != 0) {
                    N.M4gFreVH(j, str3);
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                int i2 = WelcomeActivity.w;
                ((WelcomeActivity) obj2).R((u65) obj);
                break;
            default:
                aco acoVar = (aco) obj2;
                acoVar.m(null, false);
                acoVar.p(new q6((String) obj));
                break;
        }
    }
}
