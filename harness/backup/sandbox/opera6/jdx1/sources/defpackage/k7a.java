package defpackage;

/* loaded from: classes.dex */
public final class k7a {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof k7a) {
            return this.a == ((k7a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        byte b = this.a;
        return b == 16 ? "Confirm" : b == 6 ? "ContextClick" : b == 13 ? "GestureEnd" : b == 23 ? "GestureThresholdActivate" : b == 3 ? "KeyboardTap" : b == 0 ? "LongPress" : b == 17 ? "Reject" : b == 27 ? "SegmentFrequentTick" : b == 26 ? "SegmentTick" : b == 9 ? "TextHandleMove" : b == 22 ? "ToggleOff" : b == 21 ? "ToggleOn" : b == 1 ? "VirtualKey" : "Invalid";
    }
}
