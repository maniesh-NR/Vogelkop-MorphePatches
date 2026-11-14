package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.opera.android.favorites.SuggestionFavoriteLayoutManager;

/* loaded from: classes.dex */
public final class s93 extends iph {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s93(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) throws Resources.NotFoundException {
        d dVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                boolean zW = cs5.W(((y93) obj).v);
                int iS = RecyclerView.S(view);
                if (iS != -1 && (dVar = recyclerView.m) != null) {
                    if (zW) {
                        if (iS != dVar.getItemCount() - 1) {
                        }
                    } else if (iS != 0) {
                    }
                    int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131165270);
                    if (!zW) {
                        rect.left = dimensionPixelSize - view.getPaddingStart();
                        break;
                    } else {
                        rect.right = dimensionPixelSize - view.getPaddingEnd();
                        break;
                    }
                }
                break;
            case 1:
            default:
                super.getItemOffsets(rect, view, recyclerView, vphVar);
                break;
            case 2:
                SuggestionFavoriteLayoutManager suggestionFavoriteLayoutManager = (SuggestionFavoriteLayoutManager) obj;
                if (RecyclerView.S(view) != recyclerView.m.getItemCount() - 1) {
                    boolean zW2 = cs5.W(suggestionFavoriteLayoutManager.d);
                    int i = suggestionFavoriteLayoutManager.g;
                    if (!zW2) {
                        rect.right = i;
                        break;
                    } else {
                        rect.left = i;
                        break;
                    }
                } else {
                    rect.setEmpty();
                    break;
                }
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        switch (this.a) {
            case 1:
                ((ev7) this.b).j();
                break;
            default:
                super.onDraw(canvas, recyclerView, vphVar);
                break;
        }
    }
}
