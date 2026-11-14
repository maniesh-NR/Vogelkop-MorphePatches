package defpackage;

import android.net.Uri;
import android.os.Build;
import android.util.SparseBooleanArray;
import com.opera.android.Lazy;
import com.opera.api.Callback;
import java.util.List;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class ez implements Callback {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public ez(fz fzVar, hz hzVar) {
        this.a = (byte) 0;
        this.b = hzVar;
        this.c = fzVar;
    }

    public /* synthetic */ ez(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        uvg uvgVar = uvg.ACTIVE;
        boolean z = true;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                hz hzVar = (hz) obj2;
                fz fzVar = (fz) obj3;
                hzVar.getClass();
                iz izVar = (iz) hzVar.b;
                if (!((Boolean) obj).booleanValue() && fzVar.f < 3) {
                    fzVar.a(izVar.b, izVar.d, izVar.e, hzVar);
                    izVar.a();
                    break;
                } else {
                    if (izVar.f.remove(fzVar)) {
                        izVar.a();
                    }
                    ig igVar = izVar.h;
                    vml.a(igVar);
                    vml.d(igVar, 60000L);
                    break;
                }
            case 1:
                String str = ((gu9) obj).w;
                vo7 vo7Var = (vo7) ((Lazy) obj3).get();
                GURL gurl = new GURL(str);
                vo7Var.getClass();
                vo7Var.a(gurl, false);
                vx3 vx3VarA = ay3.a(wqm.I(str), lqm.p, false);
                o18.t(vx3VarA, true, vx3VarA);
                break;
            case 2:
                j7m j7mVar = (j7m) obj;
                cj9 cj9Var = (cj9) j7mVar.a;
                uvg uvgVar2 = (uvg) j7mVar.b;
                List list = (List) j7mVar.c;
                bhi bhiVar = (bhi) obj2;
                p0i p0iVar = t0i.b;
                mpe mpeVar = (mpe) obj3;
                String str2 = (String) list.get(0);
                String str3 = (String) list.get(1);
                String str4 = (String) list.get(2);
                String str5 = (String) list.get(3);
                String str6 = (String) list.get(4);
                String str7 = str6 == null ? "" : str6;
                String str8 = (String) mpeVar.l.get();
                String str9 = (String) mpeVar.b.get();
                String str10 = (String) mpeVar.c.get();
                String str11 = cj9Var.b;
                String str12 = cj9Var.a;
                bhiVar.resumeWith(new kcl(str7, str12 == null ? "xx" : str12, str11, (String) mpeVar.j.get(), ((Boolean) mpeVar.f.get()).booleanValue() ? mcl.CHROMEBOOK : mcl.ANDROID, cj9Var.e, str9, str10, str5, str8, str4, uvgVar2 == uvgVar ? ocl.PREMIUM : ocl.FREE, str2, str3, (ou9) mpeVar.k.get(), (ebb) mpeVar.n.get(), Integer.valueOf(Build.VERSION.SDK_INT).intValue()));
                break;
            case 3:
                j7m j7mVar2 = (j7m) obj;
                cj9 cj9Var2 = (cj9) j7mVar2.a;
                uvg uvgVar3 = (uvg) j7mVar2.b;
                List list2 = (List) j7mVar2.c;
                bhi bhiVar2 = (bhi) obj2;
                p0i p0iVar2 = t0i.b;
                tze tzeVar = (tze) obj3;
                String str13 = (String) list2.get(0);
                String str14 = (String) list2.get(1);
                String str15 = (String) list2.get(2);
                String str16 = (String) list2.get(3);
                String str17 = (String) list2.get(4);
                String str18 = str17 == null ? "" : str17;
                String str19 = (String) tzeVar.l.get();
                String str20 = (String) tzeVar.b.get();
                String str21 = (String) tzeVar.c.get();
                String str22 = cj9Var2.a;
                bhiVar2.resumeWith(new jcl(str18, str22 == null ? "xx" : str22, (String) tzeVar.j.get(), ((Boolean) tzeVar.f.get()).booleanValue() ? lcl.CHROMEBOOK : lcl.ANDROID, cj9Var2.e, str20, str21, str16, str19, str15, uvgVar3 == uvgVar ? ncl.PREMIUM : ncl.FREE, str13, str14, (ou9) tzeVar.k.get(), (ebb) tzeVar.n.get(), Integer.valueOf(((Number) tzeVar.o.get()).intValue())));
                break;
            case 4:
                SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) obj;
                nh4 nh4Var = (nh4) obj2;
                if (!(nh4Var.r() instanceof qh4)) {
                    int i = ((csh) obj3).d;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (sparseBooleanArray.get(i2)) {
                                i2++;
                            } else {
                                z = false;
                            }
                        }
                    }
                    p0i p0iVar3 = t0i.b;
                    nh4Var.resumeWith(Boolean.valueOf(z));
                    break;
                }
                break;
            default:
                Uri uri = (Uri) obj;
                ue9 ue9Var = (ue9) obj2;
                if (uri == null) {
                    zwg.v((Uri) obj3, ue9Var);
                    break;
                } else {
                    ue9Var.run(uri);
                    break;
                }
        }
    }
}
