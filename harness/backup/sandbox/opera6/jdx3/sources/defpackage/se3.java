package defpackage;

import com.opera.android.settings.BigSwitchButton;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class se3 extends d17 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se3(e35 e35Var) {
        super(100L);
        this.d = (byte) 1;
        this.e = e35Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ se3(Object obj, byte b) {
        super(3000L);
        this.d = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se3(p12 p12Var) {
        super(0L);
        this.d = (byte) 2;
        this.e = p12Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se3(sgi sgiVar) {
        super(10000L);
        this.d = (byte) 4;
        this.e = sgiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d17
    public final void b() {
        byte b = this.d;
        boolean z = false;
        int i = 0;
        z = false;
        byte b2 = 1;
        Object obj = this.e;
        switch (b) {
            case 0:
                BigSwitchButton bigSwitchButton = (BigSwitchButton) obj;
                bigSwitchButton.b.d();
                ((ThemeableLottieAnimationView) bigSwitchButton.a.d).t(BigSwitchButton.j, null);
                break;
            case 1:
                e35 e35Var = (e35) obj;
                ArrayList arrayList = e35Var.r;
                int size = arrayList.size();
                int i2 = 0;
                Object[] objArr = false;
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    c35 c35Var = (c35) obj2;
                    if (!c35Var.e ? false : c35Var.b.isChecked()) {
                        i2++;
                        if (!c35Var.c) {
                            objArr = true;
                        }
                    }
                }
                ac1 ac1Var = e35Var.v;
                ac1Var.b = i2;
                ac1Var.k();
                if (i2 > 0 && objArr == false) {
                    z = true;
                }
                e35Var.u.d.setEnabled(z);
                break;
            case 2:
                ((p12) obj).B(false);
                break;
            case 3:
                hd hdVar = (hd) obj;
                ko7 ko7Var = (ko7) hdVar.f;
                xbf xbfVar = (xbf) hdVar.d;
                pkg pkgVar = new pkg();
                gig gigVar = (gig) ((ode) xbfVar.c).g();
                okg okgVar = ((tjg) xbfVar.b).k;
                okgVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                okgVar.c.h(new kkg(okgVar, arrayList2, b2), true);
                ArrayList arrayList3 = pkgVar.a;
                arrayList3.addAll(arrayList2);
                pkgVar.b = gigVar.f0();
                pkgVar.c = gigVar.getCurrentPosition();
                while (i < arrayList3.size()) {
                    if (arrayList3.get(i) == null) {
                        arrayList3.remove(i);
                        int i4 = pkgVar.b;
                        if (i4 > i) {
                            pkgVar.b = i4 - 1;
                        } else if (i4 == i) {
                            pkgVar.c = 0L;
                            if (i4 == arrayList3.size()) {
                                pkgVar.b--;
                            }
                        }
                    } else {
                        i++;
                    }
                }
                ko7Var.g(pkgVar);
                break;
            default:
                sgi sgiVar = (sgi) obj;
                sgiVar.d = true;
                ((rdn) sgiVar.h).run();
                break;
        }
    }
}
