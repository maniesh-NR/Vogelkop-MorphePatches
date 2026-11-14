package defpackage;

import J.N;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.SparseArray;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import com.leanplum.utils.SizeUtil;
import com.opera.android.aiassistant.db.AiAssistantDatabase_Impl;
import com.opera.android.autofill.assetlinks.db.AssetLinksDataBase_Impl;
import com.opera.android.oauth2.OperaAccessSandbox;
import com.opera.android.oauth2.OperaAccessTokenProvider;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.c;

/* loaded from: classes.dex */
public final /* synthetic */ class pa implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pa(ge4 ge4Var, AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk) {
        this.a = (byte) 4;
        this.b = ge4Var;
    }

    public /* synthetic */ pa(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 23;
        byte b3 = 19;
        Range range = null;
        byte b4 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                wc1 wc1Var = (wc1) obj;
                if (wc1Var != null) {
                    wc1Var.a.goBack();
                }
                return Unit.a;
            case 1:
                return new File(((Context) ((xl) obj).k).getFilesDir(), "ad_debug_imps");
            case 2:
                ru ruVar = (ru) obj;
                return new tab(ruVar.requireContext(), ruVar.A);
            case 3:
                qw qwVar = (qw) obj;
                g77 g77Var = new g77((byte) 20);
                g77Var.b = qwVar.b;
                g77.d(g77Var, qwVar.a.c);
                o95.s((LinkedHashSet) g77Var.c, new pw6[]{new pw6((byte) 1)});
                jyb jybVarF = g77Var.f();
                return new bgo(jybVarF.a, jybVarF.b, new qe6(jybVarF, b2));
            case 4:
                Range[] rangeArr = (Range[]) ((ge4) obj).c(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr != null && rangeArr.length != 0) {
                    for (Range range2 : rangeArr) {
                        Integer numValueOf = (Integer) range2.getUpper();
                        Integer numValueOf2 = (Integer) range2.getLower();
                        if (((Number) range2.getUpper()).intValue() >= 1000) {
                            numValueOf = Integer.valueOf(((Number) range2.getUpper()).intValue() / 1000);
                        }
                        if (((Number) range2.getLower()).intValue() >= 1000) {
                            numValueOf2 = Integer.valueOf(((Number) range2.getLower()).intValue() / 1000);
                        }
                        Range range3 = new Range(numValueOf2, numValueOf);
                        Integer num = (Integer) range3.getUpper();
                        if (num != null && num.intValue() == 30 && (range == null || ((Number) range3.getLower()).intValue() < ((Number) range.getLower()).intValue())) {
                            range = range3;
                        }
                    }
                }
                return range;
            case 5:
                vc0 vc0Var = (vc0) obj;
                vc0Var.b.x(vc0Var.a);
                return new ulp((byte) 19);
            case 6:
                ld0 ld0Var = (ld0) obj;
                zpa zpaVar = ld0Var.a;
                kd0 kd0Var = ld0Var.b;
                hd0 hd0Var = (hd0) kd0Var.n(9);
                if (hd0Var == null) {
                    zpaVar.getClass();
                    kd0Var.q(9, 1, zpa.y());
                    hd0Var = (hd0) kd0Var.n(9);
                }
                return new id0(hd0Var);
            case 7:
                nd0 nd0Var = (nd0) obj;
                zpa zpaVar2 = nd0Var.a;
                md0 md0Var = nd0Var.b;
                kd0 kd0Var2 = (kd0) md0Var.n(0);
                if (kd0Var2 == null) {
                    zpaVar2.getClass();
                    md0Var.q(0, 1, new kd0(2443, 1, 11));
                    kd0Var2 = (kd0) md0Var.n(0);
                }
                return new ld0(zpaVar2, kd0Var2);
            case 8:
                bpd bpdVar = (bpd) obj;
                ((hm0) bpdVar.c).x((zpa) bpdVar.b);
                return new qs7((byte) 19);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                kn0 kn0Var = (kn0) obj;
                zpa zpaVar3 = kn0Var.a;
                in0 in0Var = kn0Var.b;
                if (((ri0) in0Var.n(31)) == null) {
                    zpaVar3.getClass();
                    in0Var.q(31, 1, new ri0(2443, 1, 4));
                }
                return new y55();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                vo0 vo0Var = (vo0) obj;
                zpa zpaVar4 = vo0Var.a;
                uo0 uo0Var = vo0Var.b;
                mn0 mn0Var = (mn0) uo0Var.n(5);
                if (mn0Var == null) {
                    zpaVar4.getClass();
                    uo0Var.q(5, 1, new mn0(2443, 1, 5));
                    mn0Var = (mn0) uo0Var.n(5);
                }
                return new nn0(mn0Var);
            case 11:
                hp0 hp0Var = (hp0) obj;
                zpa zpaVar5 = hp0Var.a;
                z56 z56Var = hp0Var.b;
                ue0 ue0Var = (ue0) z56Var.n(0);
                if (ue0Var == null) {
                    zpaVar5.getClass();
                    z56Var.q(0, 1, new ue0(2443, 1, 4));
                    ue0Var = (ue0) z56Var.n(0);
                }
                return new ve0(zpaVar5, ue0Var);
            case 12:
                esg esgVar = (esg) obj;
                ((kq0) esgVar.c).x((zpa) esgVar.b);
                return new ulp((byte) 18);
            case 13:
                s6h s6hVar = (s6h) obj;
                zpa zpaVar6 = (zpa) s6hVar.a;
                ls0 ls0Var = (ls0) s6hVar.b;
                if (((ao0) ls0Var.n(6)) == null) {
                    zpaVar6.getClass();
                    ls0Var.q(6, 1, new ao0(2443, 1, 3));
                }
                return new ujp((byte) 18);
            case 14:
                au0 au0Var = (au0) obj;
                zpa zpaVar7 = au0Var.a;
                xt0 xt0Var = au0Var.b;
                h66 h66Var = (h66) xt0Var.n(3);
                if (h66Var == null) {
                    zpaVar7.getClass();
                    xt0Var.q(3, 1, new h66(2443, 1, 14));
                    h66Var = (h66) xt0Var.n(3);
                }
                return new fu0(h66Var);
            case 15:
                return new rv0((AiAssistantDatabase_Impl) obj);
            case 16:
                my0 my0Var = (my0) obj;
                ekc ekcVar = (ekc) my0Var.c.get();
                ekcVar.j(my0Var.a, new ug(new ky0(my0Var, b4), (byte) 1));
                return ekcVar;
            case 17:
                sgb.k(((n91) obj).c, (CancellationException) null);
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                c26.y((fa1) obj);
                return Unit.a;
            case 19:
                return ((lfl) obj).y();
            case SizeUtil.textSize0 /* 20 */:
                return Unit.a;
            case 21:
                cg1 cg1Var = (cg1) obj;
                g77 g77Var2 = new g77((byte) 20);
                g77Var2.b = (pna) cg1Var.b.get();
                String string = ((f3j) cg1Var.a.get()).e.toString();
                if (!c.l(string, "/", false)) {
                    string = string.concat("/");
                }
                g77.d(g77Var2, string);
                o95.s((LinkedHashSet) g77Var2.c, new pw6[]{new pw6((byte) 2)});
                jyb jybVarF2 = g77Var2.f();
                return new wdo(jybVarF2.a, jybVarF2.b, new qe6(jybVarF2, b2));
            case SizeUtil.textSize1 /* 22 */:
                ((t02) obj).invoke(null);
                return Unit.a;
            case 23:
                m02 m02Var = (m02) obj;
                m02Var.a = null;
                m02Var.b = null;
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                return new File((String) ((i12) obj).b.invoke());
            case 25:
                ((s12) obj).finish(hjm.a);
                return Unit.a;
            case 26:
                ((vsn) obj).g();
                return Unit.a;
            case 27:
                zgf zgfVar = (zgf) ((k42) obj).b.get();
                String[] strArrA = OperaAccessTokenProvider.a(3);
                SparseArray sparseArray = zgfVar.a;
                OperaAccessSandbox operaAccessSandbox = (OperaAccessSandbox) sparseArray.get(0);
                if (operaAccessSandbox == null) {
                    operaAccessSandbox = new OperaAccessSandbox((a55) zgfVar.c.get(), new yf1(zgfVar.b, new kw3(b3)));
                    operaAccessSandbox.d = N.Mvg__Uqh(operaAccessSandbox);
                    sparseArray.put(0, operaAccessSandbox);
                }
                return new OperaAccessTokenProvider("sandboxed_aria", strArrA, null, null, operaAccessSandbox);
            case 28:
                return new w4((Object[]) obj, (byte) 1);
            default:
                return new ob2((AssetLinksDataBase_Impl) obj);
        }
    }
}
