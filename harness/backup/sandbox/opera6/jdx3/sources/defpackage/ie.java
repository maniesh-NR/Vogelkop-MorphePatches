package defpackage;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.Menu;
import android.view.SubMenu;
import android.view.View;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class ie {
    public final ge a;
    public final k6l b;
    public final u4l c;
    public final s9i d;
    public final x9l e;
    public final LinkedHashSet f;
    public final he g = new he(this, 0);
    public final dkf h;
    public int i;
    public final LinkedHashMap j;

    public ie(ge geVar, k6l k6lVar, u4l u4lVar, s9i s9iVar, x9l x9lVar, LinkedHashSet linkedHashSet) {
        this.a = geVar;
        this.b = k6lVar;
        this.c = u4lVar;
        this.d = s9iVar;
        this.e = x9lVar;
        this.f = linkedHashSet;
        dkf dkfVar = geVar.k;
        this.h = dkfVar == null ? null : dkfVar;
        this.i = 1;
        this.j = new LinkedHashMap();
    }

    public static void c(Menu menu) {
        menu.add(0, 0, 0, "").setActionView(2131558670).setEnabled(false);
    }

    public final void a(Menu menu, fe feVar) {
        int i = this.i;
        this.i = i + 1;
        this.j.put(Integer.valueOf(i), feVar);
        pxh pxhVarB = feVar.b();
        dkf dkfVar = this.h;
        menu.add(0, i, 0, pxhVarB.a(dkfVar.getResources())).setIcon(feVar.a().f(dkfVar));
    }

    public final void b(SubMenu subMenu, u3l u3lVar, Set set) {
        a(subMenu, yd.a);
        if (((qyi) ((pde) this.d.d).g()) instanceof pyi) {
            for (Pair pair : exg.s(this.b, u3lVar)) {
                m4l m4lVarA = this.c.a(((Number) pair.a).intValue());
                List list = (List) pair.b;
                if (!set.contains(Integer.valueOf(m4lVarA.a))) {
                    int size = list.size();
                    k4l k4lVarB = m4lVarA.b();
                    dkf dkfVar = this.h;
                    ShapeDrawable shapeDrawableD = j14.D(z7h.h(dkfVar, 24.0f), k4lVarB.a.a(dkfVar));
                    int i = b0j.d;
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawableD});
                    layerDrawable.setId(0, 0);
                    ol7 b0jVar = new b0j(layerDrawable, 0);
                    String str = String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                    if (str.length() > 2) {
                        str = "…";
                    }
                    a(subMenu, new vd(m4lVarA, j14.p(b0jVar, new ngl(str, Typeface.SANS_SERIF, z7h.h(dkfVar, 12.0f), k4lVarB.b.a(dkfVar)))));
                }
            }
        }
    }

    public final SubMenu d(Menu menu, fe feVar) {
        ImageView imageView;
        int i = this.i;
        this.i = i + 1;
        this.j.put(Integer.valueOf(i), feVar);
        pxh pxhVarB = feVar.b();
        dkf dkfVar = this.h;
        SubMenu subMenuAddSubMenu = menu.addSubMenu(0, i, 0, pxhVarB.a(dkfVar.getResources()));
        subMenuAddSubMenu.setIcon(feVar.a().f(dkfVar));
        subMenuAddSubMenu.clearHeader();
        subMenuAddSubMenu.getItem().setActionView(2131559197);
        View actionView = subMenuAddSubMenu.getItem().getActionView();
        if (actionView != null && (imageView = (ImageView) actionView.findViewById(2131361894)) != null) {
            imageView.setImageResource(2131232029);
        }
        return subMenuAddSubMenu;
    }

    public void e(Menu menu) {
        zi4.y(this.h).a(this.g);
        this.e.o();
    }
}
