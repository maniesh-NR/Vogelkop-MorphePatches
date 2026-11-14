package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class zud implements bj8 {
    public final bj8 a;
    public final eyl b;

    public zud(bj8 bj8Var, eyl eylVar) {
        this.a = bj8Var;
        this.b = eylVar;
    }

    @Override // defpackage.bj8
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // defpackage.bj8
    public final boolean b(long j, wz4 wz4Var, List list) {
        return this.a.b(j, wz4Var, list);
    }

    @Override // defpackage.bj8
    public final boolean c(int i, long j) {
        return this.a.c(i, j);
    }

    @Override // defpackage.bj8
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.bj8
    public final void disable() {
        this.a.disable();
    }

    @Override // defpackage.bj8
    public final void e(long j, long j2, long j3, List list, ggd[] ggdVarArr) {
        this.a.e(j, j2, j3, list, ggdVarArr);
    }

    @Override // defpackage.bj8
    public final void enable() {
        this.a.enable();
    }

    public final boolean equals(Object obj) {
        if (i(obj) && (obj instanceof zud)) {
            return this.b.equals(((zud) obj).b);
        }
        return false;
    }

    @Override // defpackage.bj8
    public final int evaluateQueueSize(long j, List list) {
        return this.a.evaluateQueueSize(j, list);
    }

    @Override // defpackage.bj8
    public final int f(oj9 oj9Var) {
        return this.a.indexOf(this.b.b(oj9Var));
    }

    @Override // defpackage.bj8
    public final void g(boolean z) {
        this.a.g(z);
    }

    @Override // defpackage.bj8
    public final oj9 getFormat(int i) {
        return this.b.d[this.a.getIndexInTrackGroup(i)];
    }

    @Override // defpackage.bj8
    public final int getIndexInTrackGroup(int i) {
        return this.a.getIndexInTrackGroup(i);
    }

    @Override // defpackage.bj8
    public final oj9 getSelectedFormat() {
        return this.b.d[this.a.getSelectedIndexInTrackGroup()];
    }

    @Override // defpackage.bj8
    public final int getSelectedIndex() {
        return this.a.getSelectedIndex();
    }

    @Override // defpackage.bj8
    public final int getSelectedIndexInTrackGroup() {
        return this.a.getSelectedIndexInTrackGroup();
    }

    @Override // defpackage.bj8
    public final Object getSelectionData() {
        return this.a.getSelectionData();
    }

    @Override // defpackage.bj8
    public final int getSelectionReason() {
        return this.a.getSelectionReason();
    }

    @Override // defpackage.bj8
    public final eyl getTrackGroup() {
        return this.b;
    }

    @Override // defpackage.bj8
    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final boolean i(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zud) {
            return this.a.equals(((zud) obj).a);
        }
        return false;
    }

    @Override // defpackage.bj8
    public final int indexOf(int i) {
        return this.a.indexOf(i);
    }

    @Override // defpackage.bj8
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.bj8
    public final void onPlaybackSpeed(float f) {
        this.a.onPlaybackSpeed(f);
    }
}
