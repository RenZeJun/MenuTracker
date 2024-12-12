let map;
async function loadGoogleMapsAPI() {
    fetch(`/map/get-google-map-url`)
        .then(response => response.text())
        .then(apiUrl => {
            const script = document.createElement('script');
            script.src = apiUrl;
            script.defer = true;
            document.head.appendChild(script);
    })
        .catch(error => {
        console.error('Error loading Google Maps API:', error);
    });
}

async function initMap() {
    const { Map } = await google.maps.importLibrary("maps");
    map = new Map(document.getElementById("map"), {
        center: { lat: 47.622, lng: -122.303},
        zoom: 15,
    });
    if (navigator.geolocation){
        navigator.geolocation.getCurrentPosition(
            (position) => {
                const pos = {
                    lat: position.coords.latitude,
                    lng: position.coords.longitude,
                };
                console.log(pos);
                map.setCenter(pos);
            },
//            () => {
//                handleLocationError(true, infoWindow, map.getCenter());
//            },
        );
    }
}

loadGoogleMapsAPI();
