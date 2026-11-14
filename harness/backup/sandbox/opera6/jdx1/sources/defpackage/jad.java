package defpackage;

import defpackage.aad;
import java.util.Map;

/* loaded from: classes.dex */
public final class jad implements had {
    private static <K, V> int getSerializedSizeLite(int i, Object obj, Object obj2) {
        fad fadVar = (fad) obj;
        aad aadVar = (aad) obj2;
        int iComputeMessageSize = 0;
        if (fadVar.isEmpty()) {
            return 0;
        }
        for (Map.Entry<Object, Object> entry : fadVar.entrySet()) {
            iComputeMessageSize += aadVar.computeMessageSize(i, entry.getKey(), entry.getValue());
        }
        return iComputeMessageSize;
    }

    private static <K, V> fad mergeFromLite(Object obj, Object obj2) {
        fad fadVarMutableCopy = (fad) obj;
        fad fadVar = (fad) obj2;
        if (!fadVar.isEmpty()) {
            if (!fadVarMutableCopy.isMutable()) {
                fadVarMutableCopy = fadVarMutableCopy.mutableCopy();
            }
            fadVarMutableCopy.mergeFrom(fadVar);
        }
        return fadVarMutableCopy;
    }

    @Override // defpackage.had
    public Map<?, ?> forMapData(Object obj) {
        return (fad) obj;
    }

    @Override // defpackage.had
    public aad.a forMapMetadata(Object obj) {
        return ((aad) obj).getMetadata();
    }

    @Override // defpackage.had
    public Map<?, ?> forMutableMapData(Object obj) {
        return (fad) obj;
    }

    @Override // defpackage.had
    public int getSerializedSize(int i, Object obj, Object obj2) {
        return getSerializedSizeLite(i, obj, obj2);
    }

    @Override // defpackage.had
    public boolean isImmutable(Object obj) {
        return !((fad) obj).isMutable();
    }

    @Override // defpackage.had
    public Object mergeFrom(Object obj, Object obj2) {
        return mergeFromLite(obj, obj2);
    }

    @Override // defpackage.had
    public Object newMapField(Object obj) {
        return fad.emptyMapField().mutableCopy();
    }

    @Override // defpackage.had
    public Object toImmutable(Object obj) {
        ((fad) obj).makeImmutable();
        return obj;
    }
}
