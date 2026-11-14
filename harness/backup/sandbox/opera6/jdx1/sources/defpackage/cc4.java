package defpackage;

/* loaded from: classes.dex */
public interface cc4 extends skh {
    public static final an2 Jo = new an2("camerax.core.camera.useCaseConfigFactory", tsm.class, null);
    public static final an2 Ko = new an2("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);
    public static final an2 Lo = new an2("camerax.core.camera.SessionProcessor", d4j.class, null);
    public static final an2 Mo = new an2("camerax.core.camera.isPostviewSupported", Boolean.class, null);
    public static final an2 No = new an2("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);

    default void p() {
        if (b(Lo, null) == null) {
            return;
        }
        h9o.t();
    }
}
