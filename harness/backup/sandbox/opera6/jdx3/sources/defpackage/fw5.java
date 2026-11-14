package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class fw5 implements xbd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fw5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.xbd
    public final void a(s9i s9iVar, k73 k73Var) {
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                String str = ((nel) k73Var).g;
                cxj cxjVar = (cxj) s9iVar.d;
                cxjVar.a.append(str);
                ArrayList arrayList = ((gw5) obj).a;
                if (!arrayList.isEmpty()) {
                    int iA0 = s9iVar.a0() - str.length();
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        ks3 ks3Var = ((ngc) obj2).a;
                        Matcher matcher = bgc.a.matcher(str);
                        while (matcher.find()) {
                            ks3Var.K(cxjVar, matcher.group(), matcher.group(), matcher.start() + iA0, matcher.end() + iA0);
                        }
                    }
                    break;
                }
                break;
            case 1:
                s9iVar.m0((zc7) k73Var);
                lgc lgcVar = (lgc) obj;
                o5h o5hVar = lgcVar.a;
                HashMap map = ((jc9) s9iVar.c).a;
                mgc mgcVar = (mgc) map.get(o5hVar);
                if (mgcVar != null) {
                    map.remove(o5hVar);
                    cxj cxjVar2 = (cxj) s9iVar.d;
                    int i2 = mgcVar.a;
                    int iA02 = s9iVar.a0();
                    ks3 ks3Var2 = lgcVar.b;
                    ArrayList arrayList2 = (ArrayList) ks3Var2.i;
                    String str2 = null;
                    if (arrayList2 != null) {
                        str2 = (String) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
                    }
                    ks3Var2.K(cxjVar2, str2, mgcVar.b, i2, iA02);
                    break;
                }
                break;
            default:
                mfc mfcVar = (mfc) k73Var;
                int iA03 = s9iVar.a0();
                s9iVar.m0(mfcVar);
                cxj cxjVar3 = (cxj) s9iVar.d;
                ((ks3) obj).K(cxjVar3, mfcVar.g, cxjVar3.subSequence(iA03, s9iVar.a0()).toString(), iA03, s9iVar.a0());
                break;
        }
    }
}
