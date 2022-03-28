 Row {
    Image(
        painter = painterResource(id = R.drawable.img),
        contentDescription = "card logo",
        modifier = Modifier
            .size(55.dp, 55.dp)
            .align(Alignment.CenterVertically)
            .padding(8.dp, 0.dp, 0.dp, 0.dp)
    )
    Text(
        text = "Jetpack Compose Card",
        fontSize = 20.sp,
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(0.8f)
            .align(Alignment.CenterVertically)
    )
    IconButton(
        onClick = { },
        modifier = Modifier
            .padding(4.dp, 10.dp, 8.dp, 10.dp)
            .fillMaxWidth(0.8f)
            .align(Alignment.CenterVertically)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_arrow_right),
            contentDescription = "arrow logo"
        )
    }
}