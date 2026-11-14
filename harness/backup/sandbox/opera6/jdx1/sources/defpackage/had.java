package defpackage;

import defpackage.aad;
import java.util.Map;

/* loaded from: classes.dex */
public interface had {
    Map<?, ?> forMapData(Object obj);

    aad.a forMapMetadata(Object obj);

    Map<?, ?> forMutableMapData(Object obj);

    int getSerializedSize(int i, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
