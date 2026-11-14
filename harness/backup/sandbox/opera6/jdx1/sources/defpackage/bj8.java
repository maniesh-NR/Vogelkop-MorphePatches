package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public interface bj8 {
    boolean a(int i, long j);

    default boolean b(long j, wz4 wz4Var, List list) {
        return false;
    }

    boolean c(int i, long j);

    default void d() {
    }

    void disable();

    void e(long j, long j2, long j3, List list, ggd[] ggdVarArr);

    void enable();

    int evaluateQueueSize(long j, List list);

    int f(oj9 oj9Var);

    void g(boolean z);

    oj9 getFormat(int i);

    int getIndexInTrackGroup(int i);

    oj9 getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    eyl getTrackGroup();

    default void h() {
    }

    int indexOf(int i);

    int length();

    void onPlaybackSpeed(float f);
}
