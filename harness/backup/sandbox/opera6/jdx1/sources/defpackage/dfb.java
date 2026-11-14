package defpackage;

/* loaded from: classes.dex */
public interface dfb extends ffb {
    void addLong(long j);

    long getLong(int i);

    @Override // defpackage.ffb
    /* synthetic */ boolean isModifiable();

    @Override // defpackage.ffb
    /* synthetic */ void makeImmutable();

    @Override // defpackage.ffb
    dfb mutableCopyWithCapacity(int i);

    long setLong(int i, long j);
}
