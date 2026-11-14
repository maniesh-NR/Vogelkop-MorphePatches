package defpackage;

/* loaded from: classes.dex */
public final class wwf implements e8n {
    public final vwf a;
    public int b;
    public float c;

    public wwf(vwf vwfVar) {
        this.a = vwfVar;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
        this.c = i + f;
        this.a.o();
    }

    public final void onPageSelected(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        this.a.o();
    }
}
