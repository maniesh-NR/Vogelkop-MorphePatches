package defpackage;

import com.opera.android.FullscreenWebActivity;
import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;

/* loaded from: classes.dex */
public final class wt2 implements c7d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wt2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void d(int i) {
    }

    private final void e() {
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.app.Activity, com.opera.android.FullscreenWebActivity] */
    @Override // defpackage.c7d
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                e7d.c(this);
                ((AutofillPasswordPickerActivity) obj).finish();
                break;
            case 3:
                ?? r3 = (FullscreenWebActivity) obj;
                r3.x = null;
                r3.finish();
                break;
            case 4:
                ((wyd) obj).d(false);
                break;
            case 5:
                System.exit(-1);
                break;
            case 6:
                u9k u9kVar = (u9k) obj;
                pde pdeVar = u9kVar.a;
                if (pdeVar.g() instanceof r9k) {
                    tn tnVar = u9kVar.b;
                    if (tnVar != null) {
                        u9kVar.b = null;
                        tnVar.a = true;
                        s03 s03Var = (s03) tnVar.b;
                        avj avjVar = cak.d;
                        avj.f(s03Var);
                        s03Var.run();
                    }
                    pdeVar.r(new q9k(vep.A(i) == 2 ? 1 : 0));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.app.Activity, com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.app.Activity, com.opera.android.FullscreenWebActivity] */
    @Override // defpackage.c7d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess() {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt2.onSuccess():void");
    }
}
