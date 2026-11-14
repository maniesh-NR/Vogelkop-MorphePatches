package defpackage;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class apg implements Spannable {
    public static final Object c = new Object();
    public static ExecutorService d;
    public final Spannable a;
    public final PrecomputedText b;

    public apg(PrecomputedText precomputedText) {
        this.a = precomputedText;
        this.b = precomputedText;
    }

    public apg(CharSequence charSequence) {
        this.a = new SpannableString(charSequence);
        this.b = null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a.charAt(i);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.a.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            qp2.o("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else {
            this.b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            qp2.o("MetricAffectingSpan can not be set to PrecomputedText.");
        } else {
            this.b.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.a.toString();
    }
}
