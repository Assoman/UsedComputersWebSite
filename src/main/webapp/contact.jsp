<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set var="pageTitle" scope="request" value="Contact Us"/>
<c:set var="pageName" scope="request" value="Contact Us"/>
<%@include file="templates/head.jsp"%>

    <body>
        <!-- navbar -->
        <%@include file="templates/navigation.jsp"%>


        <div class="tm-contact-img-container">
            
        </div>

        <section class="tm-section">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-6 col-xl-6">

                        <section>
                            <h3 class="tm-gold-text tm-form-title">Contact Us Form</h3>
                            <p class="tm-form-description">Please, feel free to contact us if you have any concern or feedback.
                                Our representatives will be more than happy to assist you. We appreciate your feedback and looking forward to hear you. Thank you.</p>


                            <form action="#" method="post" class="tm-contact-form">
                                <div class="form-group">
                                    <input type="text" id="contact_name" name="contact_name" class="form-control" placeholder="Name"  required/>
                                </div>
                                <div class="form-group">
                                    <input type="email" id="contact_email" name="contact_email" class="form-control" placeholder="Email"  required/>
                                </div>
                                <div class="form-group">
                                    <input type="text" id="contact_subject" name="contact_subject" class="form-control" placeholder="Subject"  required/>
                                </div>
                                <div class="form-group">
                                    <textarea id="contact_message" name="contact_message" class="form-control" rows="6" placeholder="Message" required></textarea>
                                </div>
                            
                                <button type="submit" class="tm-btn">Submit</button>                          
                            </form>   
                        </section>
                        
                        <section class="tm-margin-t-mid tm-map-section">
                            <h3 class="tm-gold-text tm-form-title">Google Maps</h3>

                            <div id="google-map"></div>

                            <p class="tm-form-description">Sorry, this service currently unavailable. It should be back in phase 2.</p>

                            <a href="#" class="tm-btn tm-margin-t-small">Detail</a> 
                        </section>                        
                 

                    </div>

                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-6 col-xl-6 tm-contact-right">
                        
                        <div class="row">
                            <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                <div class="tm-aside-container">
                                    <h3 class="tm-gold-text tm-title">
                                        Categories
                                    </h3>
                                    <nav>
                                        <ul class="nav">
                                            <li><a href="https://en.wikipedia.org/wiki/Personal_computer" class="tm-text-link">Personal Computer</a></li>
                                            <li><a href="https://en.wikipedia.org/wiki/MacBook_Pro" class="tm-text-link">MacBook Pro</a></li>
                                            <li><a href="https://en.wikipedia.org/wiki/Laptop" class="tm-text-link">Laptop</a></li>
                                            <li><a href="https://en.wikipedia.org/wiki/Toughbook" class="tm-text-link">Toughbook</a></li>
                                            <li><a href="https://en.wikipedia.org/wiki/Chromebook" class="tm-text-link">Chromebook</a></li>
                                        </ul>
                                    </nav>
                                    <hr class="tm-margin-t-small">   
                                    <h3 class="tm-gold-text tm-title tm-margin-t-small">
                                        Useful Links
                                    </h3>
                                    <nav>
                                        <ul class="nav">
                                            <li><a href="https://lifehacker.com/5928184/what-should-i-watch-out-for-when-buying-a-used-or-old-computer"
                                                   class="tm-text-link">How to Buy Used Computer</a></li>
                                            <li><a href="https://www.anysoftwaretools.com/check-pc-health/" class="tm-text-link">Check Your Computer</a></li>
                                            <li><a href="https://www.pcworld.com/article/2361505/how-to-upgrade-an-old-pc-no-brainer-improvements-anyone-can-do.html"
                                                   class="tm-text-link">How to Upgrade Your Computer</a></li>
                                            <li><a href="https://www.wikihow.com/Choose-a-Computer" class="tm-text-link">How to Choose a Computer</a></li>
                                            <li><a href="https://www.systemrequirementslab.com/cyri" class="tm-text-link">System Requirement for PC Games</a></li>
                                        </ul>
                                    </nav>
                                </div>
                                 
                            </div>

                            <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                
                                <div class="tm-content-box tm-content-box-contact">
                                    <img src="img/acer.jpg" alt="Image" class="tm-margin-b-20 img-fluid">
                                    <h4 class="tm-margin-b-20 tm-gold-text">Acer</h4>
                                    <p class="tm-margin-b-20 tm-p-small">Acer Inc. is a Taiwanese multinational hardware and electronics corporation specializing
                                        in advanced electronics technology and is headquartered in Xizhi,
                                        New Taipei City, Taiwan</p>
                                    <a href="https://en.wikipedia.org/wiki/Acer_Inc." class="tm-btn text-uppercase">Detail</a>
                                </div> 

                                <div class="tm-content-box tm-margin-t-mid tm-content-box-contact">
                                    <img src="img/lenovo.png" alt="Image" class="tm-margin-b-20 img-fluid">
                                    <h4 class="tm-margin-b-20 tm-gold-text">Lenovo</h4>
                                    <p class="tm-margin-b-20 tm-p-small">Lenovo Group Ltd. or Lenovo PC International, often shortened to Lenovo,
                                        is a Chinese multinational technology company with headquarters in Beijing, China
                                        and Morrisville, North Carolina.</p>
                                    <a href="https://en.wikipedia.org/wiki/Lenovo" class="tm-btn text-uppercase">Read More</a>
                                </div>  

                            </div>
                        </div>
                        <hr class="tm-margin-t-mid">
                        <div class="row tm-contact-row-related-posts">
                            <div class="col-xs-12">
                                
                                <div class="tm-contact-related-posts-container">
                                    <h3 class="tm-gold-text tm-title tm-margin-b-30">Related Posts</h3>
                                    <div class="media tm-related-post">
                                        <div class="media-left media-middle">
                                            <a href="https://en.wikipedia.org/wiki/Intel">
                                                <img class="media-object" src="img/intel.jpg" alt="intel">
                                            </a>
                                        </div>
                                        <div class="media-body">
                                            <a href="https://en.wikipedia.org/wiki/Intel"><h4 class="media-heading tm-gold-text tm-margin-b-15">Intel</h4></a>
                                            <p class="tm-small-font tm-media-description">Intel Corporation is an American multinational corporation and
                                                technology company headquartered in Santa Clara, California, in the Silicon Valley.</p>
                                        </div>
                                    </div>
                                    <div class="media tm-related-post">
                                        <div class="media-left media-middle">
                                            <a href="https://en.wikipedia.org/wiki/Advanced_Micro_Devices">
                                                <img class="media-object" src="img/amd.jpg" alt="amd">
                                            </a>
                                        </div>
                                        <div class="media-body">
                                            <a href="https://en.wikipedia.org/wiki/Advanced_Micro_Devices"><h4 class="media-heading tm-gold-text tm-margin-b-15">AMD</h4></a>
                                            <p class="tm-small-font tm-media-description">Advanced Micro Devices, Inc. is an American multinational semiconductor company based in Santa Clara, California,
                                                that develops computer processors and related technologies for business and consumer markets.</p>
                                        </div>
                                    </div>
                                    <div class="media tm-related-post">
                                        <div class="media-left media-middle">
                                            <a href="https://en.wikipedia.org/wiki/Nvidia">
                                                <img class="media-object" src="img/nvidia.jpg" alt="nvidia">
                                            </a>
                                        </div>
                                        <div class="media-body">
                                            <a href="https://en.wikipedia.org/wiki/Nvidia"><h4 class="media-heading tm-gold-text tm-margin-b-15">Nvidia</h4></a>
                                            <p class="tm-small-font tm-media-description">Nvidia Corporation is an American technology company incorporated in Delaware and based in Santa Clara, California.</p>
                                        </div>
                                    </div>
                                </div>                                

                            </div>
                        </div>

                    </div>
                </div>

            </div>
        </section>

        <%@include file="templates/footer.jsp"%>

        <!-- load JS files -->
        <script src="js/jquery-1.11.3.min.js"></script>             <!-- jQuery (https://jquery.com/download/) -->
        <script src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script> <!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h --> 
        <script src="js/bootstrap.min.js"></script>                 <!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->
        <script>     
       
            /* Google map
            ------------------------------------------------*/
            var map = '';
            var center;

            function initialize() {
                var mapOptions = {
                    zoom: 16,
                    center: new google.maps.LatLng(13.758468,100.567481),
                    scrollwheel: false
                };
            
                map = new google.maps.Map(document.getElementById('google-map'),  mapOptions);

                google.maps.event.addDomListener(map, 'idle', function() {
                  calculateCenter();
                });
            
                google.maps.event.addDomListener(window, 'resize', function() {
                  map.setCenter(center);
                });
            }

            function calculateCenter() {
                center = map.getCenter();
            }

            function loadGoogleMap(){
                var script = document.createElement('script');
                script.type = 'text/javascript';
                script.src = 'https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false&' + 'callback=initialize';
                document.body.appendChild(script);
            }
        
            // DOM is ready
            $(function() {

                // Google Map
                loadGoogleMap();
            });

        </script>             

</body>
</html>