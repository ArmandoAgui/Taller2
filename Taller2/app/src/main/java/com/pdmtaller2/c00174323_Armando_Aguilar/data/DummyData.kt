package com.pdmtaller2.c00174323_Armando_Aguilar.data

import com.pdmtaller2.c00174323_Armando_Aguilar.model.Platillo
import com.pdmtaller2.c00174323_Armando_Aguilar.model.Restaurante

val dummyRestaurantes = listOf(
    // Comida Rápida
    Restaurante(
        id = 1,
        nombre = "Burger Town",
        descripcion = "Especialistas en hamburguesas gourmet",
        categoria = "Comida Rápida",
        imagenUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfajWqibp3QaI9ltOy2CmoqbljCae0PdkCww&s",
        menu = listOf(
            Platillo(1, "Hamburguesa Clásica", "Con queso, tomate y lechuga", "https://cdn.pixabay.com/photo/2014/10/23/18/05/burger-500054_960_720.jpg"),
            Platillo(2, "Hamburguesa BBQ", "Con salsa barbacoa y tocino", "https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_960_720.jpg")
        )
    ),
    Restaurante(
        id = 2,
        nombre = "Fry Express",
        descripcion = "Papas fritas, nuggets y más",
        categoria = "Comida Rápida",
        imagenUrl = "https://img.freepik.com/vector-gratis/dibujos-animados-papas-fritas-felices_1308-172286.jpg?semt=ais_hybrid&w=740",
        menu = listOf(
            Platillo(1, "Nuggets de Pollo", "Crujientes y jugosos", ""),
            Platillo(2, "Combo Frito", "Papas, nuggets y soda", "https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/C0ACC4DF-B9BE-42A2-9843-C07D68E3B159/Derivates/2CA1A918-178F-46D9-849E-1901370BA1C9.jpg")
        )
    ),
    Restaurante(
        id = 3,
        nombre = "Fast Dog",
        descripcion = "Hot dogs al instante",
        categoria = "Comida Rápida",
        imagenUrl = "https://images-platform.99static.com//97MUgxPEIWHos5IkzkfcZSx8bgE=/276x272:1200x1195/fit-in/590x590/99designs-contests-attachments/142/142135/attachment_142135722",
        menu = listOf(
            Platillo(1, "Hot Dog Clásico", "Con mostaza y ketchup", "https://upload.wikimedia.org/wikipedia/commons/b/b1/Hot_dog_with_mustard.png"),
            Platillo(2, "Hot Dog Supremo", "Con jalapeños y queso", "https://editorialtelevisa.brightspotcdn.com/dims4/default/84b5ac7/2147483647/strip/true/crop/995x560+3+0/resize/1000x563!/quality/90/?url=https%3A%2F%2Fk2-prod-editorial-televisa.s3.us-east-1.amazonaws.com%2Fbrightspot%2Fwp-content%2Fuploads%2F2019%2F04%2Fhot-dog-esquites.png")
        )
    ),

    // Comida Mexicana
    Restaurante(
        id = 4,
        nombre = "Taco Loco",
        descripcion = "Tacos auténticos al estilo mexicano",
        categoria = "Comida Mexicana",
        imagenUrl = "https://www.shutterstock.com/image-vector/mexican-restaurant-logo-combination-skull-600w-2313806863.jpg",
        menu = listOf(
            Platillo(1, "Taco al Pastor", "Con piña y cebolla", "https://cusiworld.com/wp-content/uploads/2023/02/receta-tacos-mexicanos-caseros-640x320.jpg"),
            Platillo(2, "Taco de Carne Asada", "Con guacamole y salsa verde", "https://familiakitchen.com/wp-content/uploads/2021/01/iStock-960337396-3beef-barbacoa-tacos-e1695391119564.jpg")
        )
    ),
    Restaurante(
        id = 5,
        nombre = "Burrito Bros",
        descripcion = "Burritos con ingredientes frescos",
        categoria = "Comida Mexicana",
        imagenUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTn8sHxxgFVPqaVLPrNy5olrwR3Hp49-q5Zdg&s",
        menu = listOf(
            Platillo(1, "Burrito de Pollo", "Arroz, frijoles y pollo sazonado", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRK-3kIjE0DBCKemnSOKxPuAnBrBZVRIaYBGw&s"),
            Platillo(2, "Burrito Vegetariano", "Sin carne, pero lleno de sabor", "https://www.paulinacocina.net/wp-content/uploads/2022/01/burritos-800x800.jpg")
        )
    ),
    Restaurante(
        id = 6,
        nombre = "Nacho Fiesta",
        descripcion = "Nachos y quesos para compartir",
        categoria = "Comida Mexicana",
        imagenUrl = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjNY36gCngNXmdOn9shGOs1nRfA3ecsEoId-XIY02gYeYxyjJ_-Cdmc3llAsEdna2sVG-nMZb3hAQcZuLpSKW6EF8JN-ShR5W_E8oLqv_bl9Kw3RAteUKNsBIQB3AyCS83aK9rTAIwTeE95wn6Odc3cPC17YagFQlsi4-BxxTwP4RIv_K-OAh_Wy69RySIr/s1080/la-lupa.png",
        menu = listOf(
            Platillo(1, "Nachos con Guacamole", "Crujientes con salsa", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQy5XH0ZXNt1IcMRLgJC_kwdTbXIJ6l47F-Fg&s"),
            Platillo(2, "Nachos Mixtos", "Con carne, queso y frijoles", "https://mccormick.widen.net/content/gneedwhy7p/jpeg/nachos_a_la_mexicana.jpg?crop=true&anchor=341,0&q=80&color=ffffff00&u=u0bb0o&w=1366&h=1366")
        )
    ),

    // Comida Italiana
    Restaurante(
        id = 7,
        nombre = "La Pasta",
        descripcion = "Auténtica pasta italiana",
        categoria = "Comida Italiana",
        imagenUrl = "https://img.freepik.com/vector-premium/diseno-insignia-logotipo-vector-comida-italiana_106546-1131.jpg",
        menu = listOf(
            Platillo(1, "Spaghetti Bolognesa", "Con carne molida y salsa", "https://cdn.apartmenttherapy.info/image/upload/f_jpg,q_auto:eco,c_fill,g_auto,w_1500,ar_1:1/k%2FPhoto%2FRecipes%2F2023-01-Caramelized-Tomato-Paste-Pasta%2F06-CARAMELIZED-TOMATO-PASTE-PASTA-039"),
            Platillo(2, "Fettuccine Alfredo", "Con salsa cremosa", "https://www.allrecipes.com/thmb/IrY572TXic4UXXVn8EetsarI3S0=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/AR-269500-creamy-garlic-pasta-Beauties-4x3-f404628aad2a435a9985b2cf764209b5.jpg")
        )
    ),
    Restaurante(
        id = 8,
        nombre = "Pizza Italia",
        descripcion = "Pizzas artesanales al horno",
        categoria = "Comida Italiana",
        imagenUrl = "https://static.vecteezy.com/system/resources/previews/011/074/759/non_2x/italian-restaurant-logo-italian-food-logo-template-vector.jpg",
        menu = listOf(
            Platillo(1, "Pizza Margarita", "Tomate, albahaca y mozzarella", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/Pizza_Margherita_stu_spivack.jpg/960px-Pizza_Margherita_stu_spivack.jpg"),
            Platillo(2, "Pizza Pepperoni", "Clásica con extra de queso", "https://cdn.jwplayer.com/v2/media/1znN8BBx/thumbnails/WmRQ08C1.jpg")
        )
    ),
    Restaurante(
        id = 9,
        nombre = "Risotto House",
        descripcion = "Delicias de arroz al estilo italiano",
        categoria = "Comida Italiana",
        imagenUrl = "https://us.123rf.com/450wm/vladayoung/vladayoung1703/vladayoung170301186/74963058-vector-vintage-hipster-logo-de-comida-italiana-signo-de-pizza-moderna-ilustraci%C3%B3n-mediterr%C3%A1nea.jpg",
        menu = listOf(
            Platillo(1, "Risotto de Champiñones", "Cremoso y aromático", "https://cdn.pixabay.com/photo/2016/04/27/20/51/risotto-1359789_960_720.jpg"),
            Platillo(2, "Risotto de Mariscos", "Con camarones y calamares", "https://atsloanestable.com/wp-content/uploads/2023/06/new-york-style-pizza2.jpg")
        )
    ),

    // Comida Asiática
    Restaurante(
        id = 10,
        nombre = "Sakura Sushi",
        descripcion = "Delicias japonesas y sushi fresco",
        categoria = "Comida Asiática",
        imagenUrl = "https://img.freepik.com/vector-premium/inspiracion-diseno-logotipo-restaurante-sushi-japones_500223-504.jpg",
        menu = listOf(
            Platillo(1, "Sushi Roll", "Salmón y aguacate", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2jvMS-TgX4acPMeLqoZCnJht27NJhkKQW3A&s"),
            Platillo(2, "Tempura", "Camarones rebozados", "https://media.scoolinary.app/blog/images/2024/08/plato-con-ingredientes-en-tempura-como-hacer-tempura.jpg")
        )
    ),
    Restaurante(
        id = 11,
        nombre = "Wok Time",
        descripcion = "Salteados asiáticos al instante",
        categoria = "Comida Asiática",
        imagenUrl = "https://www.shutterstock.com/shutterstock/photos/670505140/display_1500/stock-vector-china-food-panda-and-chopsticks-in-hat-logo-template-design-vector-modern-line-outline-flat-style-670505140.jpg",
        menu = listOf(
            Platillo(1, "Chow Mein", "Fideos con vegetales", "https://comedera.com/wp-content/uploads/sites/9/2020/12/pexels-bishop-tamrakar-3926135.jpg"),
            Platillo(2, "Arroz Frito", "Con pollo y huevo", "https://okdiario.com/img/2016/01/05/receta-de-arroz-frito-cantones-a-mi-manera.jpg")
        )
    ),
    Restaurante(
        id = 12,
        nombre = "Pho House",
        descripcion = "Auténtica sopa vietnamita",
        categoria = "Comida Asiática",
        imagenUrl = "https://www.zarla.com/images/zarla-5-especias-1x1-2400x2400-20211216-rx4md48mttvmfrqxhffd.png?crop=1:1,smart&width=250&dpr=2",
        menu = listOf(
            Platillo(1, "Pho de Res", "Caldo con fideos y carne", "https://www.allrecipes.com/thmb/sr3wBU9RWGz3YhsW3UTKpz-r_8U=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/57354-Beef-Pho-DDMFS-1x2-0617-48aebe36129f456da2fe3639c7466bb3.jpg"),
            Platillo(2, "Pho Vegetariano", "Versión ligera y saludable", "https://www.177milkstreet.com/assets/site/Recipes/_large/Chicken-Pho.jpg")
        )
    ),

    // Comida Saludable
    Restaurante(
        id = 13,
        nombre = "Green Bowl",
        descripcion = "Bowl nutritivos y frescos",
        categoria = "Comida Saludable",
        imagenUrl = "https://img.freepik.com/vector-gratis/comida-bebida-logo-comida-sana-plana-dibujada-mano_23-2149632256.jpg",
        menu = listOf(
            Platillo(1, "Bowl de Quinoa", "Con vegetales asados", "https://images.themodernproper.com/production/posts/2020/QuinoaBowl_4.jpg?w=1200&h=1200&q=60&fm=jpg&fit=crop&dm=1737605526&s=b91b6baac05eb76bd048a76d12f4a9cd"),
            Platillo(2, "Bowl Mediterráneo", "Con hummus y garbanzos", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBOZOd_vxPtLokk4vI2cIYIrkVbUCGyQIyFw&s")
        )
    ),
    Restaurante(
        id = 14,
        nombre = "Fit Food",
        descripcion = "Comida balanceada y ligera",
        categoria = "Comida Saludable",
        imagenUrl = "https://img.freepik.com/vector-gratis/dibujar-mano-diseno-logotipo-comida-saludable_23-2149622351.jpg",
        menu = listOf(
            Platillo(1, "Ensalada de Pollo", "Pechuga grillada y vegetales", "https://comedera.com/wp-content/uploads/sites/9/2015/10/ensalada-de-pollo.jpg"),
            Platillo(2, "Wrap de Pavo", "Con tortilla integral", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1olhA-GjUQl38wBPnibPPz3jdwwpAFXeiRg&s")
        )
    ),
    Restaurante(
        id = 15,
        nombre = "Vegan Corner",
        descripcion = "100% vegano y delicioso",
        categoria = "Comida Saludable",
        imagenUrl = "https://www.zarla.com/images/zarla-ecampia-1x1-2400x2400-20220223-394y8hhr99drtt3wft7h.png?crop=1:1,smart&width=250&dpr=2",
        menu = listOf(
            Platillo(1, "Tofu al Curry", "Con arroz integral", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpywofySbk5ZKT-Aj0Q07ZkTRHFZseJFCaOA&s"),
            Platillo(2, "Ensalada Thai", "Con mango y cacahuates", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMRwU36srEkmlurtlu2LBruOyUCIA1SWikLg&s")
        )
    ),

    // Postres y Dulces
    Restaurante(
        id = 16,
        nombre = "Sweet Spot",
        descripcion = "Postres para toda ocasión",
        categoria = "Postres y Dulces",
        imagenUrl = "https://marketplace.canva.com/EAFFOoW56oQ/2/0/1600w/canva-logo-emprendimiento-reposteria-beige-XxCzEpgh_6I.jpg",
        menu = listOf(
            Platillo(1, "Brownie de Chocolate", "Esponjoso y húmedo", "https://images.cookforyourlife.org/wp-content/uploads/2020/06/Dark-Chocolate-Brownies-shutterstock_112430981.jpg"),
            Platillo(2, "Cupcake de Vainilla", "Con glaseado de fresa", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSM8s9mwCy4Pndd-2I7ZXiPVSniN9EX9DyZug&s")
        )
    ),
    Restaurante(
        id = 17,
        nombre = "Dulce Tentación",
        descripcion = "Repostería artesanal",
        categoria = "Postres y Dulces",
        imagenUrl = "https://i.pinimg.com/474x/06/9a/d1/069ad1c2791077abc7b69a1cec359de8.jpg",
        menu = listOf(
            Platillo(1, "Cheesecake", "Con mermelada de fresa", "https://peopleenespanol.com/thmb/8vzve3hmeCgC-SVqkvAmuXnMMBE=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/cheesecake-facil-con-leche-condensada-2000-4160526441114bf3ad8f3409586a2c8a.jpg"),
            Platillo(2, "Tarta de Manzana", "Receta tradicional", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLrAB1yk5uNnu9ECLvwMia4XA92PogYUL5kA&s")
        )
    ),
    Restaurante(
        id = 18,
        nombre = "Helados del Valle",
        descripcion = "Helados artesanales y naturales",
        categoria = "Postres y Dulces",
        imagenUrl = "https://st5.depositphotos.com/50488434/66089/v/450/depositphotos_660892892-stock-illustration-dessert-logo-design-vector-icon.jpg",
        menu = listOf(
            Platillo(1, "Helado de Vainilla", "Clásico y cremoso", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6eK4eTy6JL_V401zq2r-4WyTnesLGpoqaug&s"),
            Platillo(2, "Helado de Chocolate", "Intenso y delicioso", "https://happyvegannie.com/wp-content/uploads/2022/06/img-7493-web-copia_Thumbnail-Blog-1.jpg")
        )
    ),

    // Bebidas
    Restaurante(
        id = 19,
        nombre = "Juice Bar",
        descripcion = "Jugos naturales y batidos",
        categoria = "Bebidas",
        imagenUrl = "https://marketplace.canva.com/EAF5V9i5G5g/1/0/1600w/canva-logotipo-cafeter%C3%ADa-figurativo-caf%C3%A9-y-beige-rxcvtLtKSx8.jpg",
        menu = listOf(
            Platillo(1, "Jugo Detox", "Con apio, manzana y piña", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeylfJ7qkhMlcXBpen1SwT0bVUWrd9Bzgyjw&s"),
            Platillo(2, "Smoothie de Fresa", "Refrescante y saludable", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrKlpFXtOyqwesNlmWlVHovafPwAzxRzx0xQ&s")
        )
    ),
    Restaurante(
        id = 20,
        nombre = "Coffee Time",
        descripcion = "El mejor café de la ciudad",
        categoria = "Bebidas",
        imagenUrl = "https://img.freepik.com/vector-premium/logo-vintage-comida-bebida-restaurante_116238-69.jpg",
        menu = listOf(
            Platillo(1, "Capuccino", "Con espuma de leche", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSrYFXhPwz4Mb4iwW6fLgjenqANMp5wOwXfzw&s"),
            Platillo(2, "Latte", "Suave y espumoso", "https://www.caffesociety.co.uk/assets/recipe-images/latte-small.jpg")
        )
    ),
    Restaurante(
        id = 21,
        nombre = "Refrescos El Chévere",
        descripcion = "Bebidas típicas y refrescantes",
        categoria = "Bebidas",
        imagenUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4Clj43DH1wWOrTkhNGodWSBpj0jK9nYpGWQ&s",
        menu = listOf(
            Platillo(1, "Horchata", "De morro tradicional", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRl9Pboy03FugwlHdJ4FGGI5yjFbmOCkTmkRw&s"),
            Platillo(2, "Limonada", "Natural con hierbabuena", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxG_oP0UikOmqSvpYWVQPYQcCug5IkJ6Fiww&s")
        )
    )
)
