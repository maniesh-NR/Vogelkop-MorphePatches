package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class jhc implements hhc {
    public static <E> ffb getProtobufList(Object obj, long j) {
        return (ffb) cnm.getObject(obj, j);
    }

    @Override // defpackage.hhc
    public void makeImmutableListAt(Object obj, long j) {
        getProtobufList(obj, j).makeImmutable();
    }

    @Override // defpackage.hhc
    public <E> void mergeListsAt(Object obj, Object obj2, long j) {
        ffb protobufList = getProtobufList(obj, j);
        ffb protobufList2 = getProtobufList(obj2, j);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufList.isModifiable()) {
                protobufList = protobufList.mutableCopyWithCapacity(size2 + size);
            }
            protobufList.addAll(protobufList2);
        }
        if (size > 0) {
            protobufList2 = protobufList;
        }
        cnm.putObject(obj, j, protobufList2);
    }

    @Override // defpackage.hhc
    public <L> List<L> mutableListAt(Object obj, long j) {
        ffb protobufList = getProtobufList(obj, j);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        ffb ffbVarMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size << 1);
        cnm.putObject(obj, j, ffbVarMutableCopyWithCapacity);
        return ffbVarMutableCopyWithCapacity;
    }
}
