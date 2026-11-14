package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public interface hhc {
    void makeImmutableListAt(Object obj, long j);

    <L> void mergeListsAt(Object obj, Object obj2, long j);

    <L> List<L> mutableListAt(Object obj, long j);
}
