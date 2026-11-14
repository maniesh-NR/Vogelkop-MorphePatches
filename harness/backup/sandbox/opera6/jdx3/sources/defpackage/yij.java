package defpackage;

import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public abstract class yij extends g53 {
    public final nj2 P;
    public db Q;
    public boolean R;

    public yij() {
        super(0);
        this.P = new nj2(this, (byte) 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final db M0() {
        db dbVar = this.Q;
        if (dbVar != null) {
            return dbVar;
        }
        String[] strArr = OperaApplication.K;
        db dbVarB = ((OperaApplication) getApplication()).b();
        this.Q = dbVarB;
        return dbVarB;
    }

    @Override // defpackage.g53, com.opera.android.FullscreenWebActivity, defpackage.dx3, defpackage.hjf
    public void onDestroy() {
        super.onDestroy();
        M0().h(this.P);
    }

    @Override // com.opera.android.FullscreenWebActivity
    public void p0() {
        if (this.R) {
            return;
        }
        this.R = true;
        super.p0();
    }

    @Override // defpackage.g53, com.opera.android.FullscreenWebActivity
    public final void v0() {
        super.v0();
        M0().a(this.P);
    }
}
