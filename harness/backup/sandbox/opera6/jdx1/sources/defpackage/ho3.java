package defpackage;

import J.N;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.MakeOperaDefaultBanner;
import com.opera.android.media.WebPictureInPictureActivity;
import com.opera.hype.image.editor.EditImage;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ho3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ho3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                throw null;
            case 1:
                u85 u85Var = (u85) obj;
                if (view == ((View) u85Var.e)) {
                    u85Var.f();
                    return;
                }
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                EditImage editImage = (EditImage) obj;
                dya dyaVar = editImage.d;
                it7 it7Var = editImage.c;
                dyaVar.c.add(it7Var);
                ArrayList arrayList = editImage.d.d;
                int size = arrayList.size();
                while (dimensionPixelSize < size) {
                    Object obj2 = arrayList.get(dimensionPixelSize);
                    dimensionPixelSize++;
                    it7Var.a((fya) obj2);
                }
                return;
            case 3:
                bl9 bl9Var = (bl9) obj;
                zm9 zm9Var = (zm9) bl9Var.g;
                if (zm9Var != null) {
                    if (bl9Var.b) {
                        bl9Var.b = false;
                        zm9Var.a = true;
                        zm9Var.e = q9n.j(((Fragment) zm9Var.c).getView());
                        r activity = ((Fragment) zm9Var.c).getActivity();
                        if (activity != null) {
                            activity.getWindow().addFlags(16);
                        }
                        zm9Var.d();
                        return;
                    }
                    if ((i == i5 && i2 == i6 && i3 == i7 && i4 == i8) || zm9Var == null) {
                        return;
                    }
                    zm9Var.b(true);
                    return;
                }
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                ywa ywaVar = (ywa) obj;
                bfl bflVar = (bfl) y1j.d(ywaVar.h0().e.f());
                if (bflVar != null) {
                    ywaVar.h0().e.a(bflVar, true);
                    return;
                }
                return;
            case 5:
                view.removeOnLayoutChangeListener(this);
                int i10 = MakeOperaDefaultBanner.h;
                ((MakeOperaDefaultBanner) obj).d();
                return;
            case 6:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.p;
                View view2 = searchView.x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z = searchView.getLayoutDirection() == 1;
                    dimensionPixelSize = searchView.M ? resources.getDimensionPixelSize(2131165226) + resources.getDimensionPixelSize(2131165225) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i11 = rect.left;
                    searchAutoComplete.setDropDownHorizontalOffset(z ? -i11 : paddingLeft - (i11 + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
            case 7:
                kok kokVar = (kok) obj;
                FadingRecyclerView fadingRecyclerView = kokVar.a;
                fadingRecyclerView.removeOnLayoutChangeListener(this);
                if (kokVar.r && kokVar.q) {
                    fadingRecyclerView.B0(kokVar.m);
                    return;
                }
                return;
            case 8:
                g7b g7bVar = (g7b) obj;
                g7bVar.removeOnLayoutChangeListener(g7bVar.b);
                g7bVar.setTranslationY(g7bVar.j);
                g7bVar.l = true;
                g7bVar.a(true);
                g7bVar.f.start();
                return;
            case 9:
                stl stlVar = (stl) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                stlVar.T = iArr[0];
                view.getWindowVisibleDisplayFrame(stlVar.M);
                return;
            case 10:
                ((can) ((wjj) obj).d).d();
                return;
            default:
                WebPictureInPictureActivity webPictureInPictureActivity = (WebPictureInPictureActivity) obj;
                long j = webPictureInPictureActivity.j;
                if (j == 0 || i2 == i4 || i == i3 || (i9 = i3 - i) > webPictureInPictureActivity.q) {
                    return;
                }
                N.MeDv2KCk(j, i9, i4 - i2);
                return;
        }
    }
}
