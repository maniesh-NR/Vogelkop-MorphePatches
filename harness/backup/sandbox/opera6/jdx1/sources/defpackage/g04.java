package defpackage;

/* loaded from: classes.dex */
public final class g04 extends a5 {
    public final /* synthetic */ byte d = 1;
    public final Object e;

    public g04(Object obj, int i) {
        super(i, 1, (byte) 1);
        this.e = obj;
    }

    public g04(Object[] objArr, int i, int i2) {
        super(i, i2, (byte) 1);
        this.e = objArr;
    }

    public final Object next() {
        switch (this.d) {
            case 0:
                if (!hasNext()) {
                    t3p.y();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.e;
                    int i = ((a5) this).b;
                    ((a5) this).b = i + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    t3p.y();
                    break;
                } else {
                    ((a5) this).b++;
                    break;
                }
        }
        return null;
    }

    public final Object previous() {
        switch (this.d) {
            case 0:
                if (!hasPrevious()) {
                    t3p.y();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.e;
                    int i = ((a5) this).b - 1;
                    ((a5) this).b = i;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    t3p.y();
                    break;
                } else {
                    ((a5) this).b--;
                    break;
                }
        }
        return null;
    }
}
