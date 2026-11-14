package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class a89 extends lph implements u79 {
    public static final Parcelable.Creator<a89> CREATOR = new uz8((byte) 9);
    public float e;
    public float f;
    public int g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;

    public final float E() {
        return this.f;
    }

    public final int K() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int W() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin;
    }

    public final void X0(int i) {
        this.i = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int Y0() {
        return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    public final void Z(int i) {
        this.j = i;
    }

    public final float b0() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b1() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin;
    }

    public final int describeContents() {
        return 0;
    }

    public final float e0() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getHeight() {
        return ((ViewGroup.MarginLayoutParams) this).height;
    }

    public final int getOrder() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getWidth() {
        return ((ViewGroup.MarginLayoutParams) this).width;
    }

    public final boolean m0() {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o1() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    public final int p1() {
        return this.j;
    }

    public final int t() {
        return this.g;
    }

    public final int w0() {
        return this.k;
    }

    public final int w1() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeInt(this.g);
        parcel.writeFloat(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}
