import MovieCard from "components/MovieCard";
import MovieStars from "components/MovieStars";
import Pagination from "components/Pagination";

function Listing(){
    return(
        <>
        <Pagination />
        <MovieCard />
        </>
    );
}

export default Listing;