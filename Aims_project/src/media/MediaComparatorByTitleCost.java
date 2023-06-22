package media;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<media> {
	@Override
    public int compare(media media1, media media2) {
        int result = media1.getTitle().compareTo(media2.getTitle())<0 ? 1 : ((media1.getTitle().compareTo(media2.getTitle())==0 && media1.getCost() > media2.getCost())? 1:0);
		return result;
    }
}

