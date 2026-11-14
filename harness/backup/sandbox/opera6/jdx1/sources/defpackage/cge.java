package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class cge extends iph {
    public static final DateFormat j = DateFormat.getDateInstance();
    public static final SimpleDateFormat k = new SimpleDateFormat("EEEE", Locale.getDefault());
    public final Context a;
    public final ha2 b;
    public final int c;
    public final TextPaint d;
    public final int e;
    public final int f;
    public StaticLayout g;
    public final Calendar h;
    public final Calendar i;

    public cge(RecyclerView recyclerView, ha2 ha2Var) {
        Context context = recyclerView.getContext();
        this.a = context;
        this.b = ha2Var;
        this.c = fan.a(16.0f, context.getResources());
        TextPaint paint = ((TextView) LayoutInflater.from(context).inflate(2131558844, (ViewGroup) null)).getPaint();
        this.d = paint;
        lzb lzbVar = new lzb(this, (byte) 17);
        dll dllVarS = q9n.s(recyclerView);
        if (dllVarS != null) {
            u8n.b(dllVarS, recyclerView, lzbVar);
        }
        lzbVar.a(recyclerView);
        this.e = paint.getFontMetricsInt(null);
        this.f = fan.a(12.0f, context.getResources());
        this.h = Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        this.i = calendar;
        calendar.add(6, -1);
    }

    public static boolean e(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public final Calendar f(int i) {
        if (i <= 0) {
            return null;
        }
        ha2 ha2Var = this.b;
        hb9 hb9VarJ = ha2Var.J(i - 1);
        hb9 hb9VarJ2 = ha2Var.J(i);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(hb9VarJ.c);
        calendar2.setTimeInMillis(hb9VarJ2.c);
        if (e(calendar, calendar2)) {
            return null;
        }
        return calendar2;
    }

    @Override // defpackage.iph
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        super.getItemOffsets(rect, view, recyclerView, vphVar);
        if (f(RecyclerView.S(view)) != null) {
            rect.top = this.e + this.f + rect.top;
        }
        rect.bottom += this.c;
    }

    @Override // defpackage.iph
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        StaticLayout staticLayoutBuild;
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            Calendar calendarF = f(RecyclerView.S(childAt));
            if (calendarF != null) {
                Calendar calendar = this.h;
                boolean zE = e(calendarF, calendar);
                Context context = this.a;
                String upperCase = (zE ? context.getResources().getString(2132019253) : e(calendarF, this.i) ? context.getResources().getString(2132019254) : Math.abs(calendarF.getTimeInMillis() - calendar.getTimeInMillis()) < 604800000 ? k.format(calendarF.getTime()) : j.format(calendarF.getTime())).toUpperCase(Locale.getDefault());
                StaticLayout staticLayout = this.g;
                if (staticLayout == null || !TextUtils.equals(upperCase, staticLayout.getText())) {
                    staticLayoutBuild = StaticLayout.Builder.obtain(upperCase, 0, upperCase.length(), this.d, Integer.MAX_VALUE).setAlignment(Layout.Alignment.ALIGN_NORMAL).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).setLineSpacing(1.0f, 1.0f).setIncludePad(false).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Integer.MAX_VALUE).setMaxLines(1).build();
                    this.g = staticLayoutBuild;
                } else {
                    staticLayoutBuild = this.g;
                }
                int width = (recyclerView.getWidth() - ((int) staticLayoutBuild.getLineWidth(0))) / 2;
                int iRound = ((Math.round(childAt.getTranslationY()) + childAt.getTop()) - this.e) - this.f;
                canvas.save();
                canvas.translate(width, iRound);
                staticLayoutBuild.draw(canvas);
                canvas.restore();
            }
        }
    }
}
