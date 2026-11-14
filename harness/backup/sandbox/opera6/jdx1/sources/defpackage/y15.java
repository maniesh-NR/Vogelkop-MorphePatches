package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class y15 {
    public static final y15 c = new y15();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, x15 x15Var, occ occVar, Class cls) {
        occ occVar2 = (occ) map.get(x15Var);
        if (occVar2 == null) {
            map.put(x15Var, occVar);
            return;
        }
        if (occVar == occVar2) {
            return;
        }
        String name = x15Var.b.getName();
        String name2 = cls.getName();
        qp2.o(p3p.n(z1m.n("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), String.valueOf(occVar2), ", new value ", String.valueOf(occVar)));
    }

    public final w15 a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            w15 w15VarA = (w15) map2.get(superclass);
            if (w15VarA == null) {
                w15VarA = a(superclass, null);
            }
            map.putAll(w15VarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            w15 w15VarA2 = (w15) map2.get(cls2);
            if (w15VarA2 == null) {
                w15VarA2 = a(cls2, null);
            }
            for (Map.Entry entry : w15VarA2.b.entrySet()) {
                b(map, (x15) entry.getKey(), (occ) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            ucf ucfVar = (ucf) method.getAnnotation(ucf.class);
            if (ucfVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!ndc.class.isAssignableFrom(parameterTypes[0])) {
                        qp2.o("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                occ occVarValue = ucfVar.value();
                if (parameterTypes.length > 1) {
                    if (!occ.class.isAssignableFrom(parameterTypes[1])) {
                        qp2.o("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (occVarValue != occ.ON_ANY) {
                        qp2.o("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    qp2.o("cannot have more than 2 params");
                    return null;
                }
                b(map, new x15(i, method), occVarValue, cls);
                z = true;
            }
        }
        w15 w15Var = new w15(map);
        map2.put(cls, w15Var);
        this.b.put(cls, Boolean.valueOf(z));
        return w15Var;
    }
}
