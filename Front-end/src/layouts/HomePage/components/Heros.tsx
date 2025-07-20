export const Heros = () => {
  return (
    <div>
      <div className="d-none d-lg-block">
        <div className="row g-0 mt-5">
          <div className="col-sm-6 col-md-6">
            <div className="col-image-left"></div>
          </div>
          <div className="col-4 col-md-4 container d-flex justify-content-center align-items-center">
            <div className="ml-2">
              <h1>What have you been reading?</h1>
              <p className="lead">
                What you have been reading would be greatly appreciated by the
                library staff. We will be able to give you the best content,
                whether you want to learn a new skill or advance in one you
                already have.
              </p>
              <a className="btn main-color btn-lg text-white" href="#">
                Sign up
              </a>
            </div>
          </div>
        </div>
        <div className="row g-0">
          <div
            className="col-4 col-md-4 container d-flex 
                        justify-content-center align-items-center"
          >
            <div className="ml-2">
              <h1>Our collection is always changing!</h1>
              <p className="lead">
                As our collection is constantly evolving, try to check in every
                day! For our Burak Lib students, we never stop trying to offer
                the most precise book selection we can! We are meticulous in our
                book selection, and our books will always come first.
              </p>
            </div>
          </div>
          <div className="col-sm-6 col-md-6">
            <div className="col-image-right"></div>
          </div>
        </div>
      </div>

      {/* Mobile Heros */}
      <div className="d-lg-none">
        <div className="container">
          <div className="m-2">
            <div className="col-image-left"></div>
            <div className="mt-2">
              <h1>What have you been reading?</h1>
              <p className="lead">
                What you have been reading would be greatly appreciated by the
                library staff. We will be able to give you the best content,
                whether you want to learn a new skill or advance in one you
                already have.
              </p>
              <a className="btn main-color btn-lg text-white" href="#">
                Sign up
              </a>
            </div>
          </div>
          <div className="m-2">
            <div className="col-image-right"></div>
            <div className="mt-2">
              <h1>Our collection is always changing!</h1>
              <p className="lead">
                As our collection is constantly evolving, try to check in every
                day! For our Burak Lib students, we never stop trying to offer
                the most precise book selection we can! We are meticulous in our
                book selection, and our books will always come first.
              </p>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};
