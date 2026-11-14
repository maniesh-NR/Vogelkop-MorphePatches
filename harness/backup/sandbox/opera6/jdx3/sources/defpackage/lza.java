package defpackage;

/* loaded from: classes.dex */
public interface lza {
    default String d() {
        return getClass().getSimpleName() + "{w=" + getWidth() + ", h=" + getHeight() + '}';
    }

    int getHeight();

    int getWidth();
}
