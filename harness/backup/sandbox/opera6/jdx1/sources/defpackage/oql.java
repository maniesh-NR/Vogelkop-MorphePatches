package defpackage;

import java.text.BreakIterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class oql implements rzh {
    public static final long g;
    public static final long h;
    public String a;
    public final Function1 b;
    public final BreakIterator c = BreakIterator.getWordInstance();
    public final cbl d = new cbl(this, (byte) 12);
    public int e;
    public boolean f;

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.d;
        g = cs5.x0(75, un7Var);
        h = cs5.x0(230, un7Var);
    }

    public oql(String str, Function1 function1, int i) {
        this.a = str;
        this.b = function1;
        this.e = i;
        a();
    }

    public final void a() {
        int length;
        int iCodePointAt;
        char cCharAt;
        int i = this.e;
        int i2 = 1;
        if (i < this.a.length()) {
            String strSubstring = this.a.substring(i);
            BreakIterator breakIterator = this.c;
            breakIterator.setText(strSubstring);
            int next = breakIterator.next();
            if (next == -1) {
                length = this.a.length();
            } else {
                int iCharCount = i + next;
                if (next == 1 && ((cCharAt = this.a.charAt(iCharCount - 1)) == '#' || cCharAt == '*' || cCharAt == '-' || cCharAt == '~' || cCharAt == '_' || cCharAt == '`')) {
                    while (iCharCount < this.a.length() && this.a.charAt(iCharCount) == cCharAt) {
                        iCharCount++;
                    }
                }
                String str = this.a;
                while (iCharCount < str.length() && (iCodePointAt = Character.codePointAt(str, iCharCount)) != 10 && Character.isWhitespace(iCodePointAt)) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
                length = iCharCount;
            }
            this.e = length;
        }
        this.b.invoke(Integer.valueOf(this.e));
        if (this.e == this.a.length()) {
            return;
        }
        int iCharCount2 = 0;
        CharSequence charSequenceSubSequence = this.a.subSequence(0, i);
        int i3 = 1;
        int iCharCount3 = 0;
        while (iCharCount3 < charSequenceSubSequence.length()) {
            int iCodePointAt2 = Character.codePointAt(charSequenceSubSequence, iCharCount3);
            if (iCodePointAt2 == 10) {
                i3++;
            }
            iCharCount3 += Character.charCount(iCodePointAt2);
        }
        CharSequence charSequenceSubSequence2 = this.a.subSequence(0, this.e);
        while (iCharCount2 < charSequenceSubSequence2.length()) {
            int iCodePointAt3 = Character.codePointAt(charSequenceSubSequence2, iCharCount2);
            if (iCodePointAt3 == 10) {
                i2++;
            }
            iCharCount2 += Character.charCount(iCodePointAt3);
        }
        vml.d(this.d, i2 > i3 ? pn7.f(h) : pn7.f(g));
    }

    public final void cancel() {
        if (this.f) {
            return;
        }
        this.f = true;
        vml.a(this.d);
        if (this.e < this.a.length()) {
            this.b.invoke(Integer.valueOf(this.a.length()));
        }
    }

    public final void l(String str) {
        this.a = str;
    }
}
