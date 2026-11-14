package defpackage;

/* loaded from: classes.dex */
public interface e3c extends f17 {
    default int E(o1d o1dVar, pfd pfdVar, int i) {
        return c(new jib(o1dVar, o1dVar.getLayoutDirection()), new lr6(pfdVar, zye.b, aze.b, (byte) 2), ap5.b(0, i, 0, 0, 13)).getHeight();
    }

    default int N(o1d o1dVar, pfd pfdVar, int i) {
        return c(new jib(o1dVar, o1dVar.getLayoutDirection()), new lr6(pfdVar, zye.a, aze.a, (byte) 2), ap5.b(0, 0, 0, i, 7)).getWidth();
    }

    ufd c(vfd vfdVar, pfd pfdVar, long j);

    default int f(o1d o1dVar, pfd pfdVar, int i) {
        return c(new jib(o1dVar, o1dVar.getLayoutDirection()), new lr6(pfdVar, zye.b, aze.a, (byte) 2), ap5.b(0, 0, 0, i, 7)).getWidth();
    }

    default int r0(o1d o1dVar, pfd pfdVar, int i) {
        return c(new jib(o1dVar, o1dVar.getLayoutDirection()), new lr6(pfdVar, zye.a, aze.b, (byte) 2), ap5.b(0, i, 0, 0, 13)).getHeight();
    }
}
