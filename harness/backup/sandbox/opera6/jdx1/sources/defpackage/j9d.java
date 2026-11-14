package defpackage;

/* loaded from: classes.dex */
public final class j9d {
    private final ovd messageInfoFactory;

    public j9d() {
        this(getDefaultMessageInfoFactory());
    }

    private j9d(ovd ovdVar) {
        this.messageInfoFactory = (ovd) ifb.checkNotNull(ovdVar, "messageInfoFactory");
    }

    private static boolean allowExtensions(mvd mvdVar) {
        return g9d.$SwitchMap$com$google$protobuf$ProtoSyntax[mvdVar.getSyntax().ordinal()] != 1;
    }

    private static ovd getDefaultMessageInfoFactory() {
        return xu9.getInstance();
    }

    private static <T> ani newSchema(Class<T> cls, mvd mvdVar) {
        return qwd.newSchema(cls, mvdVar, spe.lite(), mhc.lite(), fni.unknownFieldSetLiteSchema(), allowExtensions(mvdVar) ? hl8.lite() : null, mad.lite());
    }

    private static boolean useLiteRuntime(Class<?> cls) {
        return m21.assumeLiteRuntime || gv9.class.isAssignableFrom(cls);
    }

    public <T> ani createSchema(Class<T> cls) {
        fni.requireGeneratedMessage(cls);
        if (useLiteRuntime(cls)) {
            mvd mvdVarMessageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
            return mvdVarMessageInfoFor.isMessageSetWireFormat() ? twd.newSchema(fni.unknownFieldSetLiteSchema(), hl8.lite(), mvdVarMessageInfoFor.getDefaultInstance()) : newSchema(cls, mvdVarMessageInfoFor);
        }
        qp2.o("Full runtime messages are not supported by this schema factory: ".concat(cls.getName()));
        return null;
    }
}
