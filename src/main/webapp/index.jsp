<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="pageTitle" scope="request" value="Used Computers SBT"/>
<c:set var="pageName" scope="request" value="Sell Buy Trade"/>
<%@include file="templates/head.jsp"%>
<html>

    <body>
        <!-- navbar and title-->
        <%@include file="templates/navigation.jsp"%>

        <div class="tm-home-img-container">
            <img src="img/tm-home-img.jpg" alt="Image" class="hidden-lg-up img-fluid">
        </div>

        <section class="tm-section">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-xs-center">
                        <h2 class="tm-gold-text tm-title">Products</h2>
                        <%@include file="templates/productResults.jsp"%>
                        <!--<form action="logoutUser" method="post">
                            <input type="submit" value="Logout" />
                        </form> -->
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

                        <div class="tm-content-box">
                            <img src="img/dell.jpg" alt="Image" class="tm-margin-b-20 img-fluid">
                            <h4 class="tm-margin-b-20 tm-gold-text">Dell</h4>
                            <p class="tm-margin-b-20">Dell (stylized as DELL) is an American multinational computer technology company
                                based in Round Rock, Texas, United States, that develops, sells, repairs, and supports computers
                                and related products and services. Eponymously named after its founder, Michael Dell, the company is one of the largest technological corporations
                                in the world, employing more than 103,300 people worldwide.</p>
                            <a href="https://en.wikipedia.org/wiki/Dell" class="tm-btn text-uppercase">Detail</a>
                        </div>  

                    </div>

                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

                        <div class="tm-content-box">
                            <img src="img/hp.jpg" alt="Image" class="tm-margin-b-20 img-fluid">
                            <h4 class="tm-margin-b-20 tm-gold-text">HP</h4>
                            <p class="tm-margin-b-20">The Hewlett-Packard Company (commonly referred to as HP) or shortened to Hewlett-Packard
                                was an American multinational information technology company headquartered in Palo Alto, California.
                                It developed and provided a wide variety of hardware components as well as software and related services to consumers,
                                small- and medium-sized businesses (SMBs) and large enterprises, including customers in the government,
                                health and education sectors.</p>
                            <a href="https://en.wikipedia.org/wiki/Hewlett-Packard" class="tm-btn text-uppercase">Read More</a>
                        </div>  

                    </div>

                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

                        <div class="tm-content-box">
                            <br />
                            <img src="img/samsung.jpg" alt="Image" class="tm-margin-b-20 img-fluid">
                            <br />
                            <br />
                            <h4 class="tm-margin-b-20 tm-gold-text">Samsung</h4>
                            <p class="tm-margin-b-20">Samsung is a South Korean multinational conglomerate headquartered in Samsung Town, Seoul.
                                It comprises numerous affiliated businesses, most of them united under the Samsung brand, and is the largest South Korean chaebol
                                (business conglomerate).</p>
                            <a href="https://en.wikipedia.org/wiki/Samsung" class="tm-btn text-uppercase">Detail</a>
                        </div>  

                    </div>

                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

                        <div class="tm-content-box">
                            <br />
                            <img src="img/asus.jpg" alt="Image" class="tm-margin-b-20 img-fluid">
                            <br />
                            <br />
                            <h4 class="tm-margin-b-20 tm-gold-text">Asus</h4>
                            <p class="tm-margin-b-20">AsusTek Computer Inc. stylised as ASUSTeK or ΛSUS is a Taiwanese multinational computer and phone hardware
                                and electronics company headquartered in Beitou District, Taipei, Taiwan.
                                Its products include desktops, laptops, netbooks, mobile phones, networking equipment, monitors, WIFI routers, projectors,
                                motherboards, graphics cards, optical storage, multimedia products, peripherals, wearables, servers, workstations,
                                and tablet PCs. The company is also an original equipment manufacturer (OEM).</p>
                            <a href="https://en.wikipedia.org/wiki/Asus" class="tm-btn text-uppercase">Read More</a>
                        </div>  

                    </div>
                </div> <!-- row -->

                <div class="row tm-margin-t-big">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-6 col-xl-6">
                        <div class="tm-2-col-left">
                            
                            <h3 class="tm-gold-text tm-title">Computers</h3>
                            <p class="tm-margin-b-30">History of Computers</p>
                            <img src="img/collection.jpg" alt="Image" class="tm-margin-b-40 img-fluid">
                            <p>A computer is a device that can be instructed to carry out sequences of arithmetic or logical operations automatically via computer programming.
                                Modern computers have the ability to follow generalized sets of operations, called programs. These programs enable computers to perform an extremely wide range of tasks.
                                Computers are used as control systems for a wide variety of industrial and consumer devices. This includes simple special purpose devices like microwave ovens and remote controls,
                                factory devices such as industrial robots and computer-aided design, and also general purpose devices like personal computers and mobile devices such as smartphones.
                                Early computers were only conceived as calculating devices. Since ancient times, simple manual devices like the abacus aided people in doing calculations.
                            </p>
                            <a href="https://en.wikipedia.org/wiki/Computer" class="tm-btn text-uppercase">Read More</a>

                        </div>
                    </div>

                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-6 col-xl-6">

                        <div class="tm-2-col-right">

                            <div class="tm-2-rows-md-swap">
                                <div class="tm-overflow-auto row tm-2-rows-md-down-2">
                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 col-xl-6">
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
                                    </div> <!-- col -->

                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 col-xl-6 tm-xs-m-t">
                                        <h3 class="tm-gold-text tm-title">
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
                                    </div> <!-- col -->
                                </div>                        
                                
                                <div class="row tm-2-rows-md-down-1 tm-margin-t-mid">
                                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
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
                </div> <!-- row -->

            </div>
        </section>

        <%@include file="templates/footer.jsp"%>

        <!-- load JS files -->
        <script src="js/jquery-1.11.3.min.js"></script>             <!-- jQuery (https://jquery.com/download/) -->
        <script src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script> <!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h --> 
        <script src="js/bootstrap.min.js"></script>                 <!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->
       
</body>
</html>