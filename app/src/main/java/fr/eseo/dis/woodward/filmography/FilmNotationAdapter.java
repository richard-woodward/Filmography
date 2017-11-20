package fr.eseo.dis.woodward.filmography;

import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fr.eseo.dis.woodward.filmography.data.NotationWithInternaute;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by rwoodward on 16/11/17.
 */

public class FilmNotationAdapter extends RecyclerView.Adapter<FilmNotationAdapter.NotationViewHolder> {

  private FilmNotationActivity activity;
  private List<NotationWithInternaute> notations;
  private int minNote;
  private int maxNote;
  private float avgNote;

  public FilmNotationAdapter(FilmNotationActivity filmNotationActivity) {
    this.activity = filmNotationActivity;
    setNotations(new ArrayList<NotationWithInternaute>());
  }

  public void setNotations(List<NotationWithInternaute> notations) {
    this.notations = notations;
    if ((notations != null) && (notations.size() > 0)) {
      minNote = notations.get(0).getNotation().getNote();
      maxNote = minNote;
      avgNote = minNote;
      int nbNotes = notations.size();
      for (NotationWithInternaute notation : notations) {
        if (notation.getNotation().getNote() < minNote) {
          minNote = notation.getNotation().getNote();
        }
        if (notation.getNotation().getNote() > maxNote) {
          maxNote = notation.getNotation().getNote();
        }
        avgNote = avgNote + notation.getNotation().getNote();
      }
      avgNote = (float) avgNote / (float) nbNotes;
    }
  }


  @Override
  public int getItemCount() {
    if (notations != null) {
      return notations.size();
    }
    return 0;
  }

  @Override
  public NotationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View notationView = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.list_notation_card, parent, false);
    Log.d("FilmNotationAdaper","onCreateViewHolder()");
    return new NotationViewHolder(notationView);
  }

  @Override
  public void onBindViewHolder(NotationViewHolder holder, final int position) {
    Log.d("FilmNotationAdaper","onBindViewHolder()");
    final NotationWithInternaute notation = notations.get(position);
    holder.prenom.setText(notation.getInternaute().getPrenom());
    holder.nom.setText(notation.getInternaute().getNom());
    holder.note.setText(String.valueOf(notation.getNotation().getNote()));

    if (notation.getNotation().getNote() == minNote) {
      holder.note
          .setTextColor(ResourcesCompat.getColor(activity.getResources(), R.color.min_note, null));
    } else if (notation.getNotation().getNote() == maxNote) {
      holder.note
          .setTextColor(ResourcesCompat.getColor(activity.getResources(), R.color.max_note, null));
    } else {
      holder.note.setTextColor(
          ResourcesCompat.getColor(activity.getResources(), R.color.colorPrimaryDark, null));
    }
    if (notation.getNotation().getNote() < avgNote) {
      holder.note.setBackgroundColor(
          ResourcesCompat.getColor(activity.getResources(), R.color.low_note, null));
    }
    if (notation.getNotation().getNote() > avgNote) {
      holder.note.setBackgroundColor(
          ResourcesCompat.getColor(activity.getResources(), R.color.high_note, null));
    }
  }


  class NotationViewHolder extends RecyclerView.ViewHolder {

    private final TextView prenom;
    private final TextView nom;
    private final TextView note;

    public NotationViewHolder(View view) {
      super(view);
      prenom = (TextView) view.findViewById(R.id.tv_notation_prenom);
      nom = (TextView) view.findViewById(R.id.tv_notation_nom);
      note = (TextView) view.findViewById(R.id.tv_notation_note);
    }

  }

}
