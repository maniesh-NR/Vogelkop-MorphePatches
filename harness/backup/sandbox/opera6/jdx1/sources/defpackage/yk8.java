package defpackage;

import defpackage.gv9;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class yk8 {
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile yk8 emptyRegistry;
    private final Map<c, gv9.e> extensionsByNumber;
    private static volatile b lazyExtensionMode = b.EAGER;
    static final yk8 EMPTY_REGISTRY_LITE = new yk8(true);

    public static class a {
        static final Class<?> INSTANCE = resolveExtensionClass();

        private a() {
        }

        public static Class<?> resolveExtensionClass() {
            try {
                return Class.forName(yk8.EXTENSION_CLASS_NAME);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    public enum b {
        EAGER,
        LAZY_VERIFY_ON_ACCESS
    }

    public static final class c {
        private final int number;
        private final Object object;

        public c(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.object == cVar.object && this.number == cVar.number;
        }

        public int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }
    }

    public yk8() {
        this.extensionsByNumber = new HashMap();
    }

    public yk8(yk8 yk8Var) {
        if (yk8Var == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = Collections.EMPTY_MAP;
        } else {
            this.extensionsByNumber = Collections.unmodifiableMap(yk8Var.extensionsByNumber);
        }
    }

    public yk8(boolean z) {
        this.extensionsByNumber = Collections.EMPTY_MAP;
    }

    public static yk8 getEmptyRegistry() {
        yk8 yk8VarCreateEmpty;
        if (m21.assumeLiteRuntime) {
            return EMPTY_REGISTRY_LITE;
        }
        yk8 yk8Var = emptyRegistry;
        if (yk8Var != null) {
            return yk8Var;
        }
        synchronized (yk8.class) {
            yk8VarCreateEmpty = emptyRegistry;
            if (yk8VarCreateEmpty == null) {
                yk8VarCreateEmpty = vk8.createEmpty();
                emptyRegistry = yk8VarCreateEmpty;
            }
        }
        return yk8VarCreateEmpty;
    }

    public static b getLazyExtensionMode() {
        return lazyExtensionMode;
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static boolean lazyExtensionEnabled() {
        return lazyExtensionMode == b.LAZY_VERIFY_ON_ACCESS;
    }

    public static yk8 newInstance() {
        return m21.assumeLiteRuntime ? new yk8() : vk8.create();
    }

    public static void setEagerlyParseMessageSets(boolean z) {
        eagerlyParseMessageSets = z;
    }

    public static void setLazyExtensionMode(b bVar) {
        lazyExtensionMode = bVar;
    }

    public final void add(gv9.e eVar) {
        this.extensionsByNumber.put(new c(eVar.getContainingTypeDefaultInstance(), eVar.getNumber()), eVar);
    }

    public final void add(tk8 tk8Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (tk8Var instanceof gv9.e) {
            add((gv9.e) tk8Var);
        }
        if (m21.assumeLiteRuntime || !vk8.isFullRegistry(this)) {
            return;
        }
        try {
            getClass().getMethod("add", a.INSTANCE).invoke(this, tk8Var);
        } catch (Exception e) {
            throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", tk8Var), e);
        }
    }

    public <ContainingType extends rvd> gv9.e findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return this.extensionsByNumber.get(new c(containingtype, i));
    }

    public yk8 getUnmodifiable() {
        return new yk8(this);
    }
}
