package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class eq4 extends rj6 implements lnk {
    public lnk e;
    public long f;
    public final /* synthetic */ byte g = 0;
    public Object h;

    public /* synthetic */ eq4() {
    }

    public eq4(s17 s17Var) {
        this.h = s17Var;
    }

    @Override // defpackage.lnk
    public final List getCues(long j) {
        lnk lnkVar = this.e;
        lnkVar.getClass();
        return lnkVar.getCues(j - this.f);
    }

    @Override // defpackage.lnk
    public final long getEventTime(int i) {
        lnk lnkVar = this.e;
        lnkVar.getClass();
        return lnkVar.getEventTime(i) + this.f;
    }

    @Override // defpackage.lnk
    public final int getEventTimeCount() {
        lnk lnkVar = this.e;
        lnkVar.getClass();
        return lnkVar.getEventTimeCount();
    }

    @Override // defpackage.lnk
    public final int getNextEventTimeIndex(long j) {
        lnk lnkVar = this.e;
        lnkVar.getClass();
        return lnkVar.getNextEventTimeIndex(j - this.f);
    }

    @Override // defpackage.rj6
    public final void i() {
        this.b = 0;
        this.c = 0L;
        this.d = false;
        this.e = null;
    }

    @Override // defpackage.rj6
    public final void j() {
        switch (this.g) {
            case 0:
                fq4 fq4Var = (fq4) ((jl4) this.h).b;
                i();
                fq4Var.b.add(this);
                break;
            default:
                ((s17) this.h).i(this);
                break;
        }
    }
}
