package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class bl8 {
    public abstract int extensionNumber(Map.Entry<?, ?> entry);

    public abstract Object findExtensionByNumber(yk8 yk8Var, rvd rvdVar, int i);

    public abstract f09 getExtensions(Object obj);

    public abstract f09 getMutableExtensions(Object obj);

    public abstract boolean hasExtensions(rvd rvdVar);

    public abstract void makeImmutable(Object obj);

    public abstract <UT, UB> UB parseExtension(Object obj, u75 u75Var, Object obj2, yk8 yk8Var, f09 f09Var, UB ub, bmm bmmVar);

    public abstract void parseLengthPrefixedMessageSetItem(u75 u75Var, Object obj, yk8 yk8Var, f09 f09Var);

    public abstract void parseMessageSetItem(v44 v44Var, Object obj, yk8 yk8Var, f09 f09Var);

    public abstract void serializeExtension(a85 a85Var, Map.Entry<?, ?> entry);

    public abstract void setExtensions(Object obj, f09 f09Var);
}
