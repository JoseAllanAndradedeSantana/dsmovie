import { ReactComponent as StarFull} from 'assets/img/star-full.svg';
import './style.css';

function MovieStars() {
    return (
        <div className="dsmovie-stars-container">
            <StarFull />
            <StarFull />
            <StarFull />
            <StarFull />
            <StarFull />
            
        </div>

    );
}

export default MovieStars;