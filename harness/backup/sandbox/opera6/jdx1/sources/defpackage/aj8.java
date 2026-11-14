package defpackage;

/* loaded from: classes.dex */
public final class aj8 {
    public final eyl a;
    public final int[] b;

    public aj8(int i, eyl eylVar, int[] iArr) {
        if (iArr.length == 0) {
            w7d.r("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = eylVar;
        this.b = iArr;
    }
}
