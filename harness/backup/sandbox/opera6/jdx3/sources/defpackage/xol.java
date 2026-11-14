package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.LayoutDirectionRelativeLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.mainmenu.tiles.MainMenuTileLayout;
import com.opera.android.ui.catalog.widget.OperaTextView;
import com.opera.hype.emoji.EmojiTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.GURLUtils;

/* loaded from: classes.dex */
public final class xol extends ygc {
    public static final cs d = new cs((byte) 7);
    public final /* synthetic */ byte b = 3;
    public Object c;

    public /* synthetic */ xol(gyg gygVar) {
        super(gygVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xol(i0h i0hVar) {
        super(i0h.f);
        this.c = i0hVar;
    }

    public xol(ArrayList arrayList, hy7 hy7Var) {
        super(new cs((byte) 3));
        this.c = hy7Var;
        H(arrayList);
    }

    public xol(y53 y53Var) {
        super(d);
        this.c = y53Var;
        setHasStableIds(true);
    }

    public final void I(k7o k7oVar) {
        ArrayList arrayList;
        this.c = k7oVar;
        if (k7oVar != null) {
            Set set = k7oVar.g;
            arrayList = new ArrayList(k95.o(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(new e7o((r7o) it.next()));
            }
        } else {
            arrayList = null;
        }
        H(arrayList);
    }

    public final long getItemId(int i) {
        switch (this.b) {
            case 0:
                return ((wol) G(i)).ordinal();
            default:
                return super/*androidx.recyclerview.widget.d*/.getItemId(i);
        }
    }

    public final int getItemViewType(int i) {
        switch (this.b) {
            case 3:
                if (((e7o) G(i)) != null) {
                    return 0;
                }
                h9o.p();
                return 0;
            default:
                return super/*androidx.recyclerview.widget.d*/.getItemViewType(i);
        }
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [android.widget.TextView, com.opera.android.custom_views.StylingTextView] */
    public final void onBindViewHolder(i iVar, int i) {
        Bitmap bitmap;
        switch (this.b) {
            case 0:
                apl aplVar = (apl) iVar;
                wol wolVar = (wol) G(i);
                kze kzeVar = aplVar.h;
                aplVar.U();
                aplVar.d = wolVar;
                MainMenuTileLayout mainMenuTileLayout = aplVar.b;
                mainMenuTileLayout.d = wolVar.a;
                mainMenuTileLayout.c();
                mainMenuTileLayout.c = wolVar.b;
                ((StylingImageView) mainMenuTileLayout.b.f).setImageDrawable(sgb.F(mainMenuTileLayout.c, mainMenuTileLayout.getContext()));
                y53 y53Var = aplVar.c;
                p1f p1fVarS = y53Var.S(wolVar);
                mainMenuTileLayout.e = p1fVarS != null ? p1fVarS.a() : false;
                mainMenuTileLayout.a();
                p1f p1fVarS2 = y53Var.S(wolVar);
                if (p1fVarS2 != null) {
                    a26.V(p1fVarS2, kzeVar, aplVar.e);
                }
                int iOrdinal = wolVar.ordinal();
                c7oVar = (iOrdinal == 0 || iOrdinal == 1) ? (ekc) y53Var.b.y.get() : null;
                aplVar.g = c7oVar;
                boolean zA = c7oVar != null ? Intrinsics.a(c7oVar.g(), Boolean.TRUE) : false;
                if (mainMenuTileLayout.f != zA) {
                    mainMenuTileLayout.f = zA;
                    mainMenuTileLayout.b();
                }
                if (c7oVar != null) {
                    a26.T(c7oVar, kzeVar, aplVar.f);
                    break;
                }
                break;
            case 1:
                pz7 pz7Var = (pz7) iVar;
                String str = (String) G(i);
                pz7Var.c = str;
                ((EmojiTextView) pz7Var.b.b).setText(str);
                break;
            case 2:
                g0h g0hVar = (g0h) iVar;
                Pair pair = (Pair) G(i);
                kf kfVar = g0hVar.b;
                LayoutDirectionRelativeLayout layoutDirectionRelativeLayout = (LayoutDirectionRelativeLayout) kfVar.b;
                Context context = layoutDirectionRelativeLayout.getContext();
                lag lagVar = (lag) pair.first;
                kag kagVar = (kag) pair.second;
                Drawable drawableF = sgb.F(ui6.z(lagVar, kagVar), context);
                ?? r13 = (StylingTextView) kfVar.c;
                r13.s(drawableF, null);
                String strS = ui6.S(context, lagVar);
                StringBuilder sb = new StringBuilder(" — ");
                i0h i0hVar = (i0h) g0hVar.c.c;
                sb.append(ui6.R(context, lagVar, kagVar, GURLUtils.getOrigin((String) i0hVar.b.e.g())));
                r13.setText(new SpannableStringBuilder().append(strS, new TextAppearanceSpan(context, 2132083420), 33).append(sb.toString(), new TextAppearanceSpan(context, 2132083421), 33));
                if (!Boolean.TRUE.equals(i0hVar.b.g.g())) {
                    layoutDirectionRelativeLayout.setFocusable(true);
                    layoutDirectionRelativeLayout.setOnClickListener(new dv2(g0hVar, lagVar, kagVar, (byte) 5));
                    break;
                } else {
                    layoutDirectionRelativeLayout.setBackground(null);
                    break;
                }
            default:
                e7o e7oVar = (e7o) G(i);
                if (e7oVar == null) {
                    h9o.p();
                    break;
                } else {
                    r7o r7oVar = e7oVar.a;
                    f7o f7oVar = (f7o) iVar;
                    nqi nqiVar = new nqi((Object) this, (byte) 21);
                    q5g q5gVar = f7oVar.b;
                    OperaTextView operaTextView = (OperaTextView) q5gVar.d;
                    operaTextView.setText(r7oVar.c.a(operaTextView.getResources()));
                    ImageView imageView = (ImageView) q5gVar.c;
                    Drawable drawableF2 = r7oVar.d.f(imageView.getContext());
                    int i2 = f7oVar.c;
                    float f = f7oVar.d;
                    int iT = f03.t(2130969300, ((ImageView) f7oVar.b.c).getContext(), 2131101243);
                    BitmapDrawable bitmapDrawable = drawableF2 instanceof BitmapDrawable ? (BitmapDrawable) drawableF2 : null;
                    if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                        c7oVar = new c7o(new Drawable[]{new hq4(bitmap, -1), new p05(f, iT, -1)});
                        int i3 = (int) (i2 - (2.0f * f));
                        c7oVar.setLayerGravity(0, 17);
                        c7oVar.setLayerSize(0, i3, i3);
                        c7oVar.setLayerGravity(1, 17);
                        c7oVar.setLayerSize(1, i2, i2);
                    }
                    imageView.setImageDrawable(c7oVar);
                    LinearLayout linearLayout = (LinearLayout) q5gVar.b;
                    linearLayout.setOnClickListener(new dv2(nqiVar, linearLayout, e7oVar, (byte) 9));
                    break;
                }
                break;
        }
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (this.b) {
            case 0:
                View viewInflate = p37.U(viewGroup).inflate(2131559014, viewGroup, false);
                if (viewInflate != null) {
                    return new apl((MainMenuTileLayout) viewInflate, (y53) this.c);
                }
                t3p.q("rootView");
                return null;
            case 1:
                yq1 yq1VarInflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131558924, viewGroup, false);
                if (yq1VarInflate != null) {
                    return new pz7(new cq3((View) yq1VarInflate, (byte) 2), (hy7) this.c);
                }
                t3p.q("rootView");
                return null;
            case 2:
                return new g0h(this, (LayoutDirectionRelativeLayout) kf.c(LayoutInflater.from(viewGroup.getContext()).inflate(2131558605, viewGroup, false)).b);
            default:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(2131559581, viewGroup, false);
                int i2 = 2131362997;
                ImageView imageView = (ImageView) w1h.j(2131362997, viewInflate2);
                if (imageView != null) {
                    i2 = 2131364702;
                    OperaTextView operaTextViewJ = w1h.j(2131364702, viewInflate2);
                    if (operaTextViewJ != null) {
                        return new f7o(new q5g((LinearLayout) viewInflate2, imageView, operaTextViewJ, (byte) 17));
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
                return null;
        }
    }

    public final void onViewRecycled(i iVar) {
        switch (this.b) {
            case 0:
                apl aplVar = (apl) iVar;
                super/*androidx.recyclerview.widget.d*/.onViewRecycled(aplVar);
                aplVar.U();
                break;
            default:
                super/*androidx.recyclerview.widget.d*/.onViewRecycled(iVar);
                break;
        }
    }
}
