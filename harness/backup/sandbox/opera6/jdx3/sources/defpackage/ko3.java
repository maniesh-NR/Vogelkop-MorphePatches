package defpackage;

import android.view.ViewGroup;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.BottomBar;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class ko3 extends r22 {
    public final /* synthetic */ byte e;
    public final pp3 f;
    public final ViewGroup g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko3(BrowserActivity browserActivity, x5f x5fVar, fd fdVar, jze jzeVar, SettingsManager settingsManager, fw3 fw3Var, BottomBar bottomBar, k6l k6lVar, v1f v1fVar, bq3 bq3Var, xj xjVar, pp3 pp3Var, w6j w6jVar, byte b) {
        super(browserActivity, bottomBar, w6jVar);
        this.e = b;
        switch (b) {
            case 1:
                super(browserActivity, bottomBar, w6jVar);
                this.f = pp3Var;
                ViewGroup viewGroup = (ViewGroup) bottomBar.findViewById(2131363646);
                this.g = viewGroup;
                new tah(browserActivity, x5fVar, fdVar, jzeVar, settingsManager, fw3Var, viewGroup, k6lVar, v1fVar, bq3Var, xjVar);
                break;
            default:
                this.f = pp3Var;
                ViewGroup viewGroup2 = (ViewGroup) bottomBar.findViewById(2131363646);
                this.g = viewGroup2;
                new tah(browserActivity, x5fVar, fdVar, jzeVar, settingsManager, fw3Var, viewGroup2, k6lVar, v1fVar, bq3Var, xjVar);
                break;
        }
    }

    @Override // defpackage.r22
    public final void M(int i) {
        byte b = this.e;
        pp3 pp3Var = this.f;
        switch (b) {
            case 0:
                super.M(i);
                i7f i7fVar = ((gbf) pp3Var.i).p;
                g7f g7fVarC = u35.c(i7fVar, i7fVar);
                while (g7fVarC.hasNext()) {
                    ((cz3) g7fVarC.next()).a();
                }
                float f = i;
                i7f i7fVar2 = (i7f) pp3Var.h;
                g7f g7fVarC2 = u35.c(i7fVar2, i7fVar2);
                while (g7fVarC2.hasNext()) {
                    ((y43) g7fVarC2.next()).p(f);
                }
                break;
            default:
                super.M(i);
                i7f i7fVar3 = ((gbf) pp3Var.i).p;
                g7f g7fVarC3 = u35.c(i7fVar3, i7fVar3);
                while (g7fVarC3.hasNext()) {
                    ((cz3) g7fVarC3.next()).a();
                }
                float f2 = i;
                i7f i7fVar4 = (i7f) pp3Var.h;
                g7f g7fVarC4 = u35.c(i7fVar4, i7fVar4);
                while (g7fVarC4.hasNext()) {
                    ((y43) g7fVarC4.next()).p(f2);
                }
                break;
        }
    }

    @Override // defpackage.r22
    public final void N(ap3 ap3Var) {
        byte b = this.e;
        ViewGroup viewGroup = this.g;
        switch (b) {
            case 0:
                super.N(ap3Var);
                viewGroup.setBackgroundColor(ap3Var.a.a);
                break;
            default:
                super.N(ap3Var);
                viewGroup.setBackgroundColor(ap3Var.a.a);
                break;
        }
    }

    @Override // defpackage.r22
    public final boolean O() {
        byte b = this.e;
        return true;
    }

    @Override // defpackage.r22
    public final no3 d(rsg rsgVar) {
        switch (this.e) {
            case 0:
                boolean z = rsgVar.b;
                boolean z2 = z && rsgVar.c;
                int iOrdinal = rsgVar.a.ordinal();
                if (iOrdinal == 0) {
                    return new no3(true, false, false);
                }
                if (iOrdinal == 1) {
                    return new no3(z, !z2, false);
                }
                h9o.p();
                return null;
            default:
                boolean z3 = rsgVar.b;
                boolean z4 = z3 && rsgVar.c;
                int iOrdinal2 = rsgVar.a.ordinal();
                if (iOrdinal2 == 0) {
                    return new no3(true, !z4, false);
                }
                if (iOrdinal2 == 1) {
                    return new no3(z3, !z4, false);
                }
                h9o.p();
                return null;
        }
    }

    @Override // defpackage.r22
    public final boolean i() {
        byte b = this.e;
        return false;
    }
}
