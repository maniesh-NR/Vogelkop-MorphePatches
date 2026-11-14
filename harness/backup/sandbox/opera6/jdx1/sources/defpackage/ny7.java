package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.emoji2.emojipicker.EmojiView;
import java.util.List;

/* loaded from: classes.dex */
public final class ny7 extends n1 {
    public static final y0b l = new y0b(new int[]{2132018823, 2132018826, 2132018824, 2132018825, 2132018822});
    public static final y0b m = new y0b(new int[]{2132083153, 2132083156, 2132083154, 2132083155, 2132083152});
    public static final l1b n;
    public final Context c;
    public final View d;
    public final List e;
    public final LinearLayout f;
    public final jf7 g;
    public final LayoutInflater h;
    public final LinearLayout i;
    public int j;
    public int k;

    static {
        k1b k1bVar = new k1b(4);
        k1bVar.e("🤝", y0b.g(2131231708, 2131231707));
        k1bVar.e("👭", y0b.g(2131231717, 2131231716));
        k1bVar.e("👫", y0b.g(2131231715, 2131231714));
        k1bVar.e("👬", y0b.g(2131231710, 2131231709));
        k1bVar.e("🧑\u200d🤝\u200d🧑", y0b.g(2131231713, 2131231712));
        k1bVar.e("💏", y0b.g(2131232717, 2131232716));
        k1bVar.e("👩\u200d❤️\u200d💋\u200d👨", y0b.g(2131232719, 2131232718));
        k1bVar.e("👨\u200d❤️\u200d💋\u200d👨", y0b.g(2131232715, 2131232714));
        k1bVar.e("👩\u200d❤️\u200d💋\u200d👩", y0b.g(2131232721, 2131232720));
        k1bVar.e("💑", y0b.g(2131231337, 2131231336));
        k1bVar.e("👩\u200d❤️\u200d👨", y0b.g(2131231339, 2131231338));
        k1bVar.e("👨\u200d❤️\u200d👨", y0b.g(2131231335, 2131231334));
        k1bVar.e("👩\u200d❤️\u200d👩", y0b.g(2131231341, 2131231340));
        n = k1bVar.b(true);
    }

    public ny7(Context context, View view, List list, LinearLayout linearLayout, jf7 jf7Var, String str) {
        super((byte) 8, false);
        this.c = context;
        this.d = view;
        this.e = list;
        this.f = linearLayout;
        this.g = jf7Var;
        this.h = LayoutInflater.from(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.i = linearLayout2;
        this.j = -1;
        this.k = -1;
        int iIndexOf = list.indexOf(str);
        if (iIndexOf > 0) {
            this.j = (iIndexOf - 1) / 5;
            this.k = (iIndexOf - (r4 * 5)) - 1;
        }
    }

    public final void H0(int i, int i2, boolean z) {
        ImageView imageView = (ImageView) this.h.inflate(2131558686, this.i).findViewById(2131362675);
        int i3 = 0;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(0, this.d.getHeight(), 1.0f));
        imageView.setImageDrawable(I0(i, imageView.getContext(), i2));
        if (z) {
            imageView.setImageTintList(ColorStateList.valueOf(-7829368));
        }
        int i4 = this.j;
        int i5 = this.k;
        if (i4 == -1) {
            i3 = i5 != -1 ? 1 : i4;
            i4 = i5;
        }
        Context context = imageView.getContext();
        y0b y0bVar = l;
        int iD = 2132018827;
        String string = context.getString((i4 == -1 || i3 != 0) ? 2132018827 : y0bVar.d(i4));
        if (i4 != -1 && i3 != 0) {
            iD = y0bVar.d(i4);
        }
        imageView.setContentDescription(context.getString(2132018828, string, context.getString(iD)));
    }

    public final void I() {
        LayoutInflater layoutInflater = this.h;
        LinearLayout linearLayout = this.i;
        layoutInflater.inflate(2131558685, linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(0);
        EmojiView emojiView = (EmojiView) linearLayout2.findViewById(2131362673);
        emojiView.a = false;
        CharSequence charSequence = (CharSequence) this.e.get(0);
        emojiView.d = charSequence;
        emojiView.post(new cn7(charSequence, emojiView, (byte) 4));
        View view = this.d;
        emojiView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
        emojiView.setClickable(true);
        emojiView.setOnClickListener(this.g);
        ((LinearLayout) linearLayout2.findViewById(2131362674)).setLayoutParams(new LinearLayout.LayoutParams((view.getWidth() * 5) / 2, view.getHeight()));
        J0();
        this.f.addView(linearLayout);
    }

    public final Drawable I0(int i, Context context, int i2) {
        y0b y0bVar = (y0b) n.get(this.e.get(0));
        if (y0bVar == null) {
            return null;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, m.d(i2));
        Resources resources = context.getResources();
        int iD = y0bVar.d(i);
        Resources.Theme theme = contextThemeWrapper.getTheme();
        ThreadLocal threadLocal = ResourcesCompat.a;
        return resources.getDrawable(iD, theme);
    }

    public final void J0() {
        LinearLayout linearLayout = this.i;
        int childCount = linearLayout.getChildCount();
        if (childCount < 1 || childCount > 2) {
            return;
        }
        if (childCount == 2) {
            linearLayout.removeViewAt(1);
        }
        int i = this.j;
        if (i == -1 || this.k == -1) {
            if (i != -1) {
                H0(0, i, false);
                return;
            }
            int i2 = this.k;
            if (i2 != -1) {
                H0(1, i2, false);
                return;
            } else {
                H0(0, 0, true);
                return;
            }
        }
        this.h.inflate(2131558685, linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(1);
        EmojiView emojiView = (EmojiView) linearLayout2.findViewById(2131362673);
        emojiView.a = false;
        emojiView.setClickable(true);
        CharSequence charSequence = (CharSequence) this.e.get((this.j * 5) + this.k + 1);
        emojiView.d = charSequence;
        emojiView.post(new cn7(charSequence, emojiView, (byte) 4));
        emojiView.setOnClickListener(this.g);
        View view = this.d;
        emojiView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
        ((LinearLayout) linearLayout2.findViewById(2131362674)).setLayoutParams(new LinearLayout.LayoutParams((view.getWidth() * 5) / 2, view.getHeight()));
    }

    public final void K() {
        int i;
        final int i2 = 0;
        while (i2 < 2) {
            final LinearLayout linearLayout = new LinearLayout(this.c);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            final int i3 = 0;
            while (i3 < 5) {
                this.h.inflate(2131558686, linearLayout);
                final ImageView imageView = (ImageView) linearLayout.getChildAt(i3);
                View view = this.d;
                imageView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
                imageView.setClickable(true);
                Context context = imageView.getContext();
                y0b y0bVar = l;
                int iD = 2132018827;
                String string = context.getString((i3 == -1 || i2 != 0) ? 2132018827 : y0bVar.d(i3));
                if (i3 != -1 && i2 != 0) {
                    iD = y0bVar.d(i3);
                }
                imageView.setContentDescription(context.getString(2132018828, string, context.getString(iD)));
                int i4 = this.j;
                if ((i4 != -1 && i2 == 0 && i4 == i3) || ((i = this.k) != -1 && i2 == 1 && i == i3)) {
                    imageView.setSelected(true);
                    imageView.setClickable(false);
                }
                imageView.setImageDrawable(this.I0(i2, imageView.getContext(), i3));
                final ny7 ny7Var = this;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: my7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        View childAt;
                        int i5 = i2;
                        ny7 ny7Var2 = ny7Var;
                        LinearLayout linearLayout2 = linearLayout;
                        int i6 = i3;
                        if (i5 == 0) {
                            int i7 = ny7Var2.j;
                            childAt = i7 != -1 ? linearLayout2.getChildAt(i7) : null;
                            ny7Var2.j = i6;
                        } else {
                            int i8 = ny7Var2.k;
                            childAt = i8 != -1 ? linearLayout2.getChildAt(i8) : null;
                            ny7Var2.k = i6;
                        }
                        if (childAt != null) {
                            childAt.setSelected(false);
                            childAt.setClickable(true);
                        }
                        ImageView imageView2 = imageView;
                        imageView2.setClickable(false);
                        imageView2.setSelected(true);
                        ny7Var2.J0();
                    }
                });
                i3++;
            }
            ny7 ny7Var2 = this;
            ny7Var2.f.addView(linearLayout);
            i2++;
            this = ny7Var2;
        }
    }

    public final Context i0() {
        return this.c;
    }

    public final View.OnClickListener l0() {
        return this.g;
    }

    public final int m0() {
        return 5;
    }

    public final LinearLayout o0() {
        return this.f;
    }

    public final View p0() {
        return this.d;
    }

    public final List q0() {
        return this.e;
    }
}
