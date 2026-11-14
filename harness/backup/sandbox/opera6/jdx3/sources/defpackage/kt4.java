package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kt4 {

    @NotNull
    public static final jt4 a;
    public static final kt4 b;
    public static final /* synthetic */ kt4[] c;
    public static final /* synthetic */ h58 d;

    static {
        kt4 kt4Var = new kt4("UNASSIGNED", 0);
        kt4 kt4Var2 = new kt4("UPPERCASE_LETTER", 1);
        kt4 kt4Var3 = new kt4("LOWERCASE_LETTER", 2);
        kt4 kt4Var4 = new kt4("TITLECASE_LETTER", 3);
        kt4 kt4Var5 = new kt4("MODIFIER_LETTER", 4);
        kt4 kt4Var6 = new kt4("OTHER_LETTER", 5);
        kt4 kt4Var7 = new kt4("NON_SPACING_MARK", 6);
        kt4 kt4Var8 = new kt4("ENCLOSING_MARK", 7);
        kt4 kt4Var9 = new kt4("COMBINING_SPACING_MARK", 8);
        kt4 kt4Var10 = new kt4("DECIMAL_DIGIT_NUMBER", 9);
        kt4 kt4Var11 = new kt4("LETTER_NUMBER", 10);
        kt4 kt4Var12 = new kt4("OTHER_NUMBER", 11);
        kt4 kt4Var13 = new kt4("SPACE_SEPARATOR", 12);
        kt4 kt4Var14 = new kt4("LINE_SEPARATOR", 13);
        kt4 kt4Var15 = new kt4("PARAGRAPH_SEPARATOR", 14);
        kt4 kt4Var16 = new kt4("CONTROL", 15);
        kt4 kt4Var17 = new kt4("FORMAT", 16);
        b = kt4Var17;
        kt4[] kt4VarArr = {kt4Var, kt4Var2, kt4Var3, kt4Var4, kt4Var5, kt4Var6, kt4Var7, kt4Var8, kt4Var9, kt4Var10, kt4Var11, kt4Var12, kt4Var13, kt4Var14, kt4Var15, kt4Var16, kt4Var17, new kt4("PRIVATE_USE", 17), new kt4("SURROGATE", 18), new kt4("DASH_PUNCTUATION", 19), new kt4("START_PUNCTUATION", 20), new kt4("END_PUNCTUATION", 21), new kt4("CONNECTOR_PUNCTUATION", 22), new kt4("OTHER_PUNCTUATION", 23), new kt4("MATH_SYMBOL", 24), new kt4("CURRENCY_SYMBOL", 25), new kt4("MODIFIER_SYMBOL", 26), new kt4("OTHER_SYMBOL", 27), new kt4("INITIAL_QUOTE_PUNCTUATION", 28), new kt4("FINAL_QUOTE_PUNCTUATION", 29)};
        c = kt4VarArr;
        d = new h58(kt4VarArr);
        a = new jt4(null);
    }

    public static kt4 valueOf(String str) {
        return (kt4) Enum.valueOf(kt4.class, str);
    }

    public static kt4[] values() {
        return (kt4[]) c.clone();
    }
}
