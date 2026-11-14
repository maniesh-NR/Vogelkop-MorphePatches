package com.opera.android.suggestion;

import J.N;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.kqk;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SuggestionManagerBridge {
    public final ArrayList b = new ArrayList();
    public final long a = N.MzoytVDl();

    public static void addSuggestion(@NonNull List<Suggestion> list, int i, @NonNull String str, @NonNull String str2, int i2, @Nullable Suggestion suggestion, @Nullable Object obj) {
        int i3;
        String str3;
        Object obj2;
        Suggestion suggestion2 = suggestion;
        if (suggestion2 == null) {
            list.add(new Suggestion(i2, str, "", str2, null, null, i, "", 0, -1, obj));
            return;
        }
        String str4 = suggestion2.d;
        if (i2 == suggestion2.a) {
            str3 = str;
            if (str3.equals(suggestion2.b) && (str2.equals(str4) || str4 == null)) {
                i3 = i;
                if (i3 == suggestion2.g) {
                    obj2 = obj;
                    if (!Objects.equals(obj2, suggestion2.k)) {
                    }
                    list.add(suggestion2);
                }
                suggestion2 = new Suggestion(i2, str3, suggestion2.c, suggestion2.d, suggestion2.e, suggestion2.f, i3, suggestion2.h, suggestion2.i, suggestion2.j, obj2);
                list.add(suggestion2);
            }
            i3 = i;
        } else {
            i3 = i;
            str3 = str;
        }
        obj2 = obj;
        suggestion2 = new Suggestion(i2, str3, suggestion2.c, suggestion2.d, suggestion2.e, suggestion2.f, i3, suggestion2.h, suggestion2.i, suggestion2.j, obj2);
        list.add(suggestion2);
    }

    @NonNull
    public static List<Suggestion> createList(int i) {
        return new ArrayList(i);
    }

    public static void reportSlowProvider(@NonNull List<kqk> list, int i) {
        try {
            list.add(kqk.values()[i]);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static void runCallback(@NonNull SuggestionListCallback suggestionListCallback, @NonNull List<Suggestion> list) {
        suggestionListCallback.d(list);
    }

    public final void a(lt8 lt8Var, kqk kqkVar, boolean z) {
        Object objD = lt8Var.d();
        if (objD != null) {
            this.b.add(objD);
        }
        N.ME2$Sfed(lt8Var.b, N.MsnOjWk7(this.a), kqkVar.ordinal(), z);
    }

    public final void finalize() throws Throwable {
        N.MKD6pB0N(this.a);
        super.finalize();
    }
}
