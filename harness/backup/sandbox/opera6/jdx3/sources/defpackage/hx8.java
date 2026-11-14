package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hx8 implements due, p5j {
    public final j4c a;
    public final j4c b;
    public final yw8 c;
    public bwf d;

    /* JADX WARN: Multi-variable type inference failed */
    public hx8(BrowserActivity browserActivity, yw8 yw8Var) {
        String[] strArr = OperaApplication.K;
        xv1 xv1Var = ((OperaApplication) browserActivity.getApplicationContext()).r;
        this.a = xv1Var.P0;
        this.b = xv1Var.k0;
        this.c = yw8Var;
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("enable_newsfeed".equals(str) || "speed_dial.enabled".equals(str)) {
            a();
        }
    }

    public final void a() {
        bwf bwfVar = this.d;
        if (bwfVar != null) {
            bx8 bx8Var = this.c.a;
            ArrayList arrayList = bx8Var.a;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i = -1;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                bwf bwfVar2 = ((zw8) obj).a;
                if (!bwfVar2.getClass().equals(bwfVar.getClass()) ? false : bwfVar2.equals(bwfVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            arrayList.set(i, new zw8(((zw8) arrayList.get(i)).a));
            bx8Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.due
    public final void b(cue cueVar) {
        a();
    }

    public final void c(bwf bwfVar) {
        bwf bwfVar2 = this.d;
        j4c j4cVar = this.a;
        j4c j4cVar2 = this.b;
        if (bwfVar2 != null) {
            ((fue) j4cVar2.get()).e(this);
            ((SettingsManager) j4cVar.get()).H(this);
        }
        this.d = bwfVar;
        if (bwfVar != null) {
            ((fue) j4cVar2.get()).b(this);
            ((SettingsManager) j4cVar.get()).F(this);
        }
    }
}
