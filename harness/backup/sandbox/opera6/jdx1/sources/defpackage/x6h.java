package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class x6h {
    private static final x6h INSTANCE = new x6h();
    private final ConcurrentMap<Class<?>, ani> schemaCache = new ConcurrentHashMap();
    private final j9d schemaFactory = new j9d();

    private x6h() {
    }

    public static x6h getInstance() {
        return INSTANCE;
    }

    private <T extends gv9> ani registerSchema(Class<T> cls) {
        ani aniVarCreateSchema = this.schemaFactory.createSchema(cls);
        ifb.checkNotNull(aniVarCreateSchema, "schema");
        ani aniVarPutIfAbsent = this.schemaCache.putIfAbsent(cls, aniVarCreateSchema);
        return aniVarPutIfAbsent != null ? aniVarPutIfAbsent : aniVarCreateSchema;
    }

    public <T extends gv9> boolean isInitialized(T t) {
        return schemaFor((x6h) t).isInitialized(t);
    }

    public <T extends gv9> void mergeFrom(T t, u75 u75Var, yk8 yk8Var) {
        schemaFor((x6h) t).mergeFrom(t, u75Var, yk8Var);
    }

    public <T extends gv9> ani schemaFor(T t) {
        return schemaFor(t.getClass());
    }

    public <T extends gv9> ani schemaFor(Class<T> cls) {
        ani aniVar = this.schemaCache.get(cls);
        return aniVar == null ? registerSchema(cls) : aniVar;
    }

    public <T extends gv9> void writeTo(T t, a85 a85Var) {
        schemaFor((x6h) t).writeTo(t, a85Var);
    }
}
