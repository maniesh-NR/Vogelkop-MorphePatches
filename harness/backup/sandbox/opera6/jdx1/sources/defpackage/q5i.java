package defpackage;

/* loaded from: classes.dex */
public final class q5i {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof q5i) {
            return this.a == ((q5i) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        byte b = this.a;
        return b == 0 ? "Button" : b == 1 ? "Checkbox" : b == 2 ? "Switch" : b == 3 ? "RadioButton" : b == 4 ? "Tab" : b == 5 ? "Image" : b == 6 ? "DropdownList" : b == 7 ? "Picker" : b == 8 ? "Carousel" : "Unknown";
    }
}
