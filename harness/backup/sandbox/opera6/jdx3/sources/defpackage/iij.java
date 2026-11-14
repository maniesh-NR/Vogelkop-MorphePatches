package defpackage;

/* loaded from: classes.dex */
public final class iij implements jij {
    public final int a;

    public iij(int i) {
        this.a = i;
    }

    public final jij a(int i, int i2) {
        return new iij((this.a - i2) + i);
    }

    public final jij cloneAndClear() {
        return new iij(0);
    }

    public final jij cloneAndInsert(int i, int i2) {
        return new iij(this.a + i2);
    }

    public final int getFirstIndex() {
        return this.a > 0 ? 0 : -1;
    }

    public final int getLastIndex() {
        int i = this.a;
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    public final int getLength() {
        return this.a;
    }

    public final int getNextIndex(int i) {
        int i2 = i + 1;
        if (i2 < this.a) {
            return i2;
        }
        return -1;
    }

    public final int getPreviousIndex(int i) {
        int i2 = i - 1;
        if (i2 >= 0) {
            return i2;
        }
        return -1;
    }
}
