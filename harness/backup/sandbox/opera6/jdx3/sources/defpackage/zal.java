package defpackage;

import android.text.style.StyleSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zal implements xbd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ abl b;

    public /* synthetic */ zal(abl ablVar, byte b) {
        this.a = b;
        this.b = ablVar;
    }

    @Override // defpackage.xbd
    public final void a(s9i s9iVar, k73 k73Var) {
        byte b = this.a;
        abl ablVar = this.b;
        switch (b) {
            case 0:
                kal kalVar = (kal) k73Var;
                s9iVar.O();
                ablVar.d = true;
                ablVar.f.clear();
                int iA0 = s9iVar.a0();
                s9iVar.m0(kalVar);
                s9iVar.e0(iA0, new avj((byte) 4));
                s9iVar.f(kalVar);
                break;
            case 1:
                ablVar.c = false;
                s9iVar.m0((mal) k73Var);
                break;
            case 2:
                ablVar.b = true;
                s9iVar.m0((sal) k73Var);
                ablVar.b = false;
                break;
            case 3:
                int iA02 = s9iVar.a0();
                ablVar.e = 0;
                s9iVar.m0((xal) k73Var);
                ((cxj) s9iVar.d).a('\n');
                if (ablVar.b) {
                    s9iVar.e0(iA02, new StyleSpan(1));
                }
                s9iVar.e0(iA02, new yal(ablVar.a, ablVar.b, ablVar.c, ablVar.d));
                ablVar.d = false;
                ablVar.c = !ablVar.c;
                break;
            default:
                oal oalVar = (oal) k73Var;
                fr frVar = ablVar.a;
                int iA03 = s9iVar.a0();
                cxj cxjVar = (cxj) s9iVar.d;
                cxjVar.a((char) 160);
                int iA04 = s9iVar.a0();
                s9iVar.m0(oalVar);
                int iA05 = s9iVar.a0();
                cxjVar.a((char) 160);
                while (true) {
                    ArrayList arrayList = ablVar.f;
                    int size = arrayList.size();
                    int i = ablVar.e;
                    if (size > i) {
                        ral ralVar = (ral) arrayList.get(i);
                        nal nalVar = oalVar.g;
                        if (nalVar == null) {
                            nalVar = nal.a;
                        }
                        ArrayList arrayList2 = ralVar.a;
                        int size2 = arrayList2.size();
                        arrayList2.add(new qal(cxjVar, iA04, iA05, nalVar));
                        pal palVar = new pal(frVar, (ral) arrayList.get(ablVar.e), size2, true, ablVar.e > 0);
                        int length = cxjVar.a.length();
                        if (iA04 > iA03 && iA03 >= 0 && iA04 <= length) {
                            cxj.d(cxjVar, palVar, iA03, iA04);
                        }
                        s9iVar.e0(iA05, new pal(frVar, (ral) arrayList.get(ablVar.e), size2, false, false));
                        ablVar.e++;
                        break;
                    } else {
                        arrayList.add(new ral());
                    }
                }
        }
    }
}
